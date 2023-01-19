package Tests;

import Pages.CheckoutPage;
import Pages.HomePage;
import Pages.IslaCrossbodyHandbagPage;
import Pages.SearchResultsPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutTest {
    private WebDriver driver = new ChromeDriver();

    @Before
    public void Driver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void Checkout() {

        HomePage homePage = new HomePage(driver);
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
        IslaCrossbodyHandbagPage bagPage = new IslaCrossbodyHandbagPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);


        homePage.setSearchField("bag");
        homePage.clickSearchButton();
        searchResultsPage.clickToProduct();
        bagPage.setMonogrammingField("MaryJulya");
        bagPage.clickAddtoCartButton();
        checkoutPage.clickCartElement();
        checkoutPage.clickRegisterandCheckout();
        checkoutPage.clickContinueButton();
        checkoutPage.setFirstNameField("Austin");
        checkoutPage.setMiddleNameField("Mary");
        checkoutPage.setLastNameField("Julya");
        checkoutPage.setCompanyField("ELIS");
        checkoutPage.setEmailField("austinmary5@yahoo.com");
        checkoutPage.setCityField("Phoenix");
        checkoutPage.setRegionField("Arizona");
        checkoutPage.setPostCodeField("337042");
        checkoutPage.setTelephoneField("0736019455");
        checkoutPage.clickSaveButton();
        Assert.assertEquals("This is a required field.", checkoutPage.getErrorMessageText());


            driver.close();
        }
    }


