package com.zebrunner.carina.demo.gui.Pages.Desktop;

import com.zebrunner.carina.demo.gui.Pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.Pages.common.ReviewsPageBase;
import com.zebrunner.carina.demo.gui.components.Desktop.NavComponent;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.DESKTOP, parentClass = ReviewsPageBase.class)
public class ReviewsPage extends ReviewsPageBase {
    @FindBy(xpath = "//header[@id='header']")
    private NavComponent desktopNavComponent;

    public ReviewsPage(WebDriver driver) {
        super(driver);
        setPageURL("/reviews.php3");
    }

    public NavComponent getDesktopNavComponent() {
        return desktopNavComponent;
    }
}
