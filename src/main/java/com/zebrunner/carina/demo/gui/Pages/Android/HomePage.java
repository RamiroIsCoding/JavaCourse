package com.zebrunner.carina.demo.gui.Pages.Android;

import com.zebrunner.carina.demo.gui.Pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.components.Android.BrandMenuComponent;
import com.zebrunner.carina.demo.gui.components.Android.NavComponent;
import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.demo.gui.components.common.brands.BrandMenuComponentBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {
    @FindBy(xpath = "//header")
    private NavComponent mobileNavComponent;
    @FindBy(xpath = "//div[@class='general-menu material-card']")
    private BrandMenuComponent brandMenuComponent;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BrandMenuComponentBase getBrandMenuComponent() {
        return brandMenuComponent;
    }

    @Override
    public NavComponentBase getNavComponent() {
        return mobileNavComponent;
    }

}
