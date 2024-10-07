package com.zebrunner.carina.demo.gui.components.Desktop;

import com.zebrunner.carina.demo.gui.Pages.Desktop.BrandPage;
import com.zebrunner.carina.demo.gui.Pages.common.BrandPageBase;
import com.zebrunner.carina.demo.gui.components.common.brands.BrandMenuComponentBase;
import com.zebrunner.carina.demo.gui.components.common.brands.PhoneBrands;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BrandMenuComponent extends BrandMenuComponentBase {
    private final String baseLocator = "//div[contains(@class, 'brandmenu-v2')]";
    @FindBy(xpath = baseLocator+"//ul/li/a[text()='%s']")
    private ExtendedWebElement phoneLocator;

    public BrandMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public BrandPageBase travelToBrandPage(PhoneBrands phoneBrand) {
        BrandPage brandPage = new BrandPage(getDriver());
        phoneLocator.format(phoneBrand.getDisplayName()).click();
        return brandPage;
    }
}
