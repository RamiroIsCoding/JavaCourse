package com.zebrunner.carina.demo.gui.Pages.Android;

import com.zebrunner.carina.demo.gui.Pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.Pages.common.VideosPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = VideosPageBase.class)
public class VideosPage extends AbstractPage {
    public VideosPage(WebDriver driver) {
        super(driver);
        setPageURL("/videos.php3");
    }
}
