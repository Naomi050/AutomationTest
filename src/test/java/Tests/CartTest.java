package Tests;

import Pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {
    private WebDriver driver = new ChromeDriver();

    @Before
    public void Driver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

        @Test
        public void AddProducts() {

            HomePage homePage = new HomePage(driver);
            SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
            ATaleOfToCitiesPage bookPages = new ATaleOfToCitiesPage(driver);
            CheckoutPage checkoutPage = new CheckoutPage(driver);
            CantStopItByShearerPage musicPage = new CantStopItByShearerPage(driver);


            homePage.setSearchField("book");
            homePage.clickSearchButton();
            searchResultsPage.clickToBookProduct();
            bookPages.setSelecttheProduct();
            bookPages.clickAddtoCartButton();
            checkoutPage.ClickToContinueShopping();
            homePage.setSearchField("music");
            homePage.clickSearchButton();
            searchResultsPage.clickTOMusicProduct();
            musicPage.clickthefieldProduct();
            musicPage.setSelectQty("4");
            musicPage.clickAddtoCartButton();


              driver.close();

            }
        }





















