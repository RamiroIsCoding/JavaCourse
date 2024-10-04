package com.zebrunner.carina.demo.gui.Pages.common;

import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class HomePageBase extends AbstractPage {
    @FindBy(xpath = "//header")
    private ExtendedWebElement header;

    public HomePageBase(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(header);
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
    }

    public abstract NavComponentBase getNavComponent();

}
