package com.zebrunner.carina.demo.gui.components.common.nav;

import com.zebrunner.carina.demo.gui.Pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.Pages.common.NewsPageBase;
import com.zebrunner.carina.demo.gui.Pages.common.ReviewsPageBase;
import com.zebrunner.carina.demo.gui.Pages.common.VideosPageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;


public abstract class NavComponentBase extends AbstractUIObject {
    public NavComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract AbstractPage  travelToPageButton(Links link);

    protected AbstractPage openPage(Links link, ExtendedWebElement element) {
        element.click();
        switch (link) {
            case HOME:
                return initPage(getDriver(), HomePageBase.class);
            case NEWS:
                return initPage(getDriver(), NewsPageBase.class);
            case REVIEWS:
                return initPage(getDriver(), ReviewsPageBase.class);
            case VIDEOS:
                return initPage(getDriver(), VideosPageBase.class);
            default:
                throw new IllegalArgumentException("Unknown page: " + link);
        }
    }
}
