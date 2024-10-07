package com.zebrunner.carina.demo.gui.components.common.brands;

import com.zebrunner.carina.demo.gui.Pages.common.BrandPageBase;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class BrandMenuComponentBase extends AbstractUIObject{
    public BrandMenuComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract BrandPageBase travelToBrandPage(PhoneBrands phoneBrands);
}
