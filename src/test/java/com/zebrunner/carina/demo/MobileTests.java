package com.zebrunner.carina.demo;

import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.Priority;
import com.zebrunner.carina.core.registrar.tag.TestPriority;
import com.zebrunner.carina.demo.gui.Pages.common.HomePageBase;
import com.zebrunner.carina.demo.gui.components.common.brands.BrandMenuComponentBase;
import com.zebrunner.carina.demo.gui.components.common.brands.PhoneBrands;
import com.zebrunner.carina.demo.gui.components.common.nav.Links;
import com.zebrunner.carina.demo.gui.components.common.nav.NavComponentBase;
import com.zebrunner.carina.webdriver.decorator.PageOpeningStrategy;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MobileTests implements IAbstractTest {
    @Test
    @MethodOwner(owner = "ramiro")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = { "web", "regression" })
    public void checkNavLinks() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        NavComponentBase navComponent = homePage.getNavComponent();
        //for loop that goes through every link and checks url
        for(Links link: Links.values()){
            System.out.println(link.getText());
            AbstractPage abstractPage = navComponent.travelToPageButton(link);
            abstractPage.assertPageOpened();
            getDriver().get(homePage.getPageURL());
        }
    }

    @Test
    @MethodOwner(owner = "ramiro")
    @TestPriority(Priority.P3)
    @TestLabel(name = "feature", value = { "web", "regression" })
    public void selectBrand() {
        HomePageBase homePage = initPage(getDriver(), HomePageBase.class);
        homePage.open();
        homePage.setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        BrandMenuComponentBase brandMenu = homePage.getBrandMenuComponent();
        brandMenu.travelToBrandPage(PhoneBrands.SAMSUNG);
        Assert.assertTrue(getDriver().getCurrentUrl().contains(PhoneBrands.SAMSUNG.getDisplayName().toLowerCase()));
    }
}
