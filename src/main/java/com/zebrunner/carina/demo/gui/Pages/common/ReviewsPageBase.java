package com.zebrunner.carina.demo.gui.Pages.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ReviewsPageBase extends AbstractPage {
    @FindBy(xpath = "//header")
    private ExtendedWebElement header;

    public ReviewsPageBase(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(header);
    }
}
