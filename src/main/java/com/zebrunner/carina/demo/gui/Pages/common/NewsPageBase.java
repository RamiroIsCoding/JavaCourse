package com.zebrunner.carina.demo.gui.Pages.common;

import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class NewsPageBase extends AbstractPage {
    @FindBy(xpath = "//header")
    private ExtendedWebElement header;
    public NewsPageBase(WebDriver driver) {
        super(driver);
        setUiLoadedMarker(header);
    }

    public abstract NavComponentBase getNavComponent();
}
