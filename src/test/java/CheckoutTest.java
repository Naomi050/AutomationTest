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
        driver.findElement(By.cssSelector("#search")).sendKeys("bag");
        driver.findElement(By.cssSelector("button.button.search-button")).click();
        driver.findElement(By.cssSelector("#product-collection-image-370")).click();
        driver.findElement(By.cssSelector("#options_4_text")).sendKeys("MaryJulya");
        driver.findElement(By.cssSelector("div.add-to-cart-buttons")).click();
        driver.findElement(By.cssSelector(".skip-cart")).click();
        driver.findElement(By.cssSelector("a.checkout-button")).click();
        driver.findElement(By.cssSelector("[value='register']")).click();
        driver.findElement(By.cssSelector("#onepage-guest-register-button")).click();
        driver.findElement(By.cssSelector("[name='billing[firstname]']")).sendKeys("Austin");
        driver.findElement(By.cssSelector("[name='billing[middlename]']")).sendKeys("Mary");
        driver.findElement(By.cssSelector("[name='billing[lastname]']")).sendKeys("Julya");
        driver.findElement(By.cssSelector("[name='billing[company]']")).sendKeys("ELIS");
        driver.findElement(By.cssSelector("[name='billing[email]']")).sendKeys("austinmary5@yahoo.com");
        driver.findElement(By.cssSelector("[name='billing[city]'")).sendKeys("Phoenix");
        driver.findElement(By.cssSelector("[name='billing[region_id]']")).sendKeys("Arizona");
        driver.findElement(By.cssSelector("[name='billing[postcode]']")).sendKeys("337042");
        driver.findElement(By.cssSelector("[name='billing[telephone]']")).sendKeys("0736019455");
        driver.findElement(By.cssSelector("[name='billing[customer_password]'")).sendKeys("acelasinume");
        driver.findElement(By.cssSelector("[name='billing[confirm_password]'")).sendKeys("acelasinume");
        driver.findElement(By.cssSelector("[onclick='billing.save()']")).click();

        WebElement adreess = driver.findElement(By.cssSelector(".validation-advice"));
        String expectedtext = "This is a required field.";
        String actualtext = adreess.getText();
        Assert.assertEquals(expectedtext,actualtext);
    }

    @After
    public void closeDriver(){
        driver.close();
    }
}
