package com.zebrunner.carina.demo.gui.components.Desktop;

import com.zebrunner.carina.demo.gui.components.common.nav.Links;
import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavComponent extends NavComponentBase {
    private final String headerBaseLocator = "//header[@id='header']";
    @FindBy(xpath = headerBaseLocator)
    private ExtendedWebElement header;
    @FindBy(xpath = headerBaseLocator+"//button")
    private ExtendedWebElement expandNavButton;
    @FindBy(xpath = headerBaseLocator+"//ul[@id='menu']//li/a[text()='%s']")
    private ExtendedWebElement pageButton;

    public NavComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public boolean isPageNavOpened(){
        System.out.println(expandNavButton.getAttribute("class"));
        return expandNavButton.getAttribute("class").contains("open");
    }

    public void clickExpandNavButton(){
        expandNavButton.click();
    }

    @Override
    public AbstractPage travelToPageButton(Links link){
        if(!isPageNavOpened()){
            clickExpandNavButton();
        }
        return openPage(link, pageButton.format(link.getText()));
    }
}
