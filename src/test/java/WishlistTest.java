import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

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


        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector(".level0.nav-5")).click();
        driver.findElement(By.cssSelector("a.product-image")).click();
        driver.findElement(By.cssSelector("[alt='Blue']")).click();
        driver.findElement(By.cssSelector("#option81")).click();
        driver.findElement(By.cssSelector("a.link-wishlist")).click();
        driver.findElement(By.id("email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector("p.back-link")).click();
        driver.findElement(By.cssSelector("#reorder-item-1827")).click();
        driver.findElement(By.cssSelector("#reorder-validate-detail > div > " +
                "div.actions > button > span > span")).click();
        driver.findElement(By.cssSelector("[title='Continue Shopping']")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > " +
                "div > div > div.std > div.widget.widget-new-products > " +
                "div.widget-products > ul > li:nth-child(3) > a > img")).click();

        WebElement product = driver.findElement(By.cssSelector("p.required"));
        String expectedText = "* Required Fields";
        String actualText = product.getText();
        Assert.assertEquals(expectedText,actualText);

        driver.findElement(By.cssSelector("[alt='Royal Blue']")).click();
        driver.findElement(By.cssSelector("#swatch80")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > " +
                "div.product-options-bottom > div.add-to-cart > " +
                "div.add-to-cart-buttons > button > span > span")).click();

        WebElement message = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > " +
                "div.cart.display-single-price > ul > li > ul > li > span"));
        String expectedmessage = "Elizabeth Knit Top was added to your shopping cart.";
        String actualmessage = message.getText();
        Assert.assertEquals(expectedmessage,actualmessage);

        WebElement price = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.first.odd > td.product-cart-total > span > span "));
        Assert.assertTrue(price.isDisplayed());

        WebElement price2 = driver.findElement(By.cssSelector("#shopping-cart-table > tbody > tr.last.even > td.product-cart-total > span > span"));
        Assert.assertTrue(price2.isDisplayed());

        driver.close();





    }
}