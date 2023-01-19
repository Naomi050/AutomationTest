package Tests;

import Pages.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WishlistTest {
    private WebDriver driver = new ChromeDriver();

    @Before
    public void Driver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

    }


    @Test
    public void addToWishlistTest() {
        HomePage homePage = new HomePage(driver);
        SlimFitDobbyOxfordShirtPage shirtPage= new SlimFitDobbyOxfordShirtPage(driver);
        LogInPage loginpage = new LogInPage(driver);
        WishlistPage wishlist= new WishlistPage(driver);
        CustomerPage customerPage = new CustomerPage(driver);
        CheckoutPage checkoutPage= new CheckoutPage(driver);
        ElizabethKnitTopPage topPage = new ElizabethKnitTopPage(driver);



        homePage.clickSaleElement();
        homePage.clickOnProduct();
        shirtPage.setSelectColor();
        shirtPage.setSelectSize();
        shirtPage.ClickWishlistLink();
        loginpage.setEmailfield("cosmin@fasttrackit.org");
        loginpage.setPasswordfield("123456");
        loginpage.clickSendButton();
        wishlist.clickBackLink();
        customerPage.setSelectProduct();
        customerPage.ClickWishlistButton();
        checkoutPage.ClickToContinueShopping();
        homePage.ClickOnProduct();
        Assert.assertEquals("* Required Fields",topPage.RequiredmessageText());
        topPage.setSelectColor();
        topPage.setSelectSize();
        topPage.clickAddtoCartbutton();
        Assert.assertEquals("Elizabeth Knit Top was added to your shopping cart.", checkoutPage.ConfirmationmessageText());
        driver.close();





    }
}