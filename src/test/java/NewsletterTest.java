import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsletterTest {

    private WebDriver driver = new ChromeDriver();

    @Before
    public void Driver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void Newsletter(){
        driver.findElement(By.cssSelector("#newsletter")).sendKeys("austinmary11@yahoo.com");
        driver.findElement(By.cssSelector("[title='Subscribe']")).click();

        WebElement ConfirmationMessage = driver.findElement(By.cssSelector("#map-popup"));
        String expectedtext = "Thank you for your subscription, Mary.";
        String actualltext = ConfirmationMessage.getText();
        Assert.assertFalse(expectedtext, actualltext.equals ("Thank you for your subscription."));
    }

    @Before
    public void closeDriver(){
        driver.close();
    }
}
