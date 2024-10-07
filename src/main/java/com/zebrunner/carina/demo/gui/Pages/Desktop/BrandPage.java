package com.zebrunner.carina.demo.gui.Pages.Desktop;

import com.zebrunner.carina.demo.gui.Pages.common.BrandPageBase;
import com.zebrunner.carina.demo.gui.Pages.common.HomePageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = BrandPageBase.class)
public class BrandPage extends BrandPageBase {
    public BrandPage(WebDriver driver) {
        super(driver);
    }
}
