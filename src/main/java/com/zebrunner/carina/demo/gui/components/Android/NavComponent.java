package com.zebrunner.carina.demo.gui.components.Android;

import com.zebrunner.carina.demo.gui.components.common.nav.Links;
import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavComponent extends NavComponentBase {
    @FindBy(xpath = "//header//nav//ul//li//a[text()='%s']")
    private ExtendedWebElement pageButton;

    public NavComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


    @Override
    public AbstractPage travelToPageButton(Links link){
        return openPage(link, pageButton.format(link.getText()));
    }


}
