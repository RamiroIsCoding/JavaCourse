package com.zebrunner.carina.demo.gui.Pages.Android;

import com.zebrunner.carina.demo.gui.Pages.common.NewsPageBase;
import com.zebrunner.carina.demo.gui.components.Android.NavComponent;
import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = NewsPageBase.class)
public class NewsPage extends NewsPageBase {
    @FindBy(xpath = "//header")
    private NavComponent mobileNavComponent;

    public NewsPage(WebDriver driver) {
        super(driver);
        setPageURL("/news.php3");
    }

    @Override
    public NavComponentBase getNavComponent() {
        return mobileNavComponent;
    }


}
