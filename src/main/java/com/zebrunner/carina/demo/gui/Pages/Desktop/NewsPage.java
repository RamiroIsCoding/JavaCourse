package com.zebrunner.carina.demo.gui.Pages.Desktop;

import com.zebrunner.carina.demo.gui.Pages.common.NewsPageBase;
import com.zebrunner.carina.demo.gui.components.Desktop.NavComponent;
import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = NewsPageBase.class)
public class NewsPage extends NewsPageBase {
    @FindBy(xpath = "//header[@id='header']")
    private NavComponent desktopNavComponent;

    public NewsPage(WebDriver driver) {
        super(driver);
        setPageURL("/news.php3");
    }

    @Override
    public NavComponentBase getNavComponent() {
        return desktopNavComponent;
    }
}
