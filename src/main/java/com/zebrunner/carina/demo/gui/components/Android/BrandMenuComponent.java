package com.zebrunner.carina.demo.gui.components.Android;

import com.zebrunner.carina.demo.gui.Pages.Android.BrandPage;
import com.zebrunner.carina.demo.gui.Pages.common.BrandPageBase;
import com.zebrunner.carina.demo.gui.components.common.brands.BrandMenuComponentBase;
import com.zebrunner.carina.demo.gui.components.common.brands.PhoneBrands;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BrandMenuComponent extends BrandMenuComponentBase {
    @FindBy(xpath = "//div[@class='general-menu material-card']//li/a[text()='%s']")
    private ExtendedWebElement brandLocator;
    @FindBy(xpath = "//h2/a[text()='Brands ']")
    private ExtendedWebElement brandsButtonLocator;

    public BrandMenuComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public BrandPageBase travelToBrandPage(PhoneBrands phoneBrand) {
        String url = getDriver().getCurrentUrl();
        if(!url.contains("makers.php3") && !brandLocator.format(phoneBrand.getDisplayName()).isPresent()){
            brandsButtonLocator.click();
        }
        brandLocator.format(phoneBrand.getDisplayName()).click();
        return new BrandPage(getDriver());
    }
}
