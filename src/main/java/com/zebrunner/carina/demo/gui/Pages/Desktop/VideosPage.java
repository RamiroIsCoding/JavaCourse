package com.zebrunner.carina.demo.gui.Pages.Desktop;

import com.zebrunner.carina.demo.gui.Pages.common.VideosPageBase;
import com.zebrunner.carina.demo.gui.components.Desktop.NavComponent;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = VideosPageBase.class)
public class VideosPage extends VideosPageBase {
    @FindBy(xpath = "//header[@id='header']")
    private NavComponent desktopNavComponent;

    public VideosPage(WebDriver driver) {
        super(driver);
        setPageURL("/videos.php3");
    }

    public NavComponent getDesktopNavComponent() {
        return desktopNavComponent;
    }
}
