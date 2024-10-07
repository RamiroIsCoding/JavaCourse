package com.zebrunner.carina.demo.gui.Pages.Desktop;

import com.zebrunner.carina.demo.gui.Pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.components.Desktop.BrandMenuComponent;
import com.zebrunner.carina.demo.gui.components.Desktop.NavComponent;
import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.demo.gui.components.common.brands.BrandMenuComponentBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = HomePageBase.class)
public class HomePage extends HomePageBase {

    @FindBy(xpath = "//header[@id='header']")
    private NavComponent desktopNavComponent;
    @FindBy(xpath = "//div[contains(@class, 'brandmenu-v2')]")
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
        return desktopNavComponent;
    }


}
