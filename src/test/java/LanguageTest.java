import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanguageTest {
    private WebDriver driver = new ChromeDriver();

    @Before
    public void Driver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void Language(){
        driver.findElement(By.cssSelector("#select-language")).sendKeys("French");

        WebElement language = driver.findElement(By.cssSelector(".welcome-msg"));
        String expectedtext = "Bienvenue";
        String actualtext = language.getText();
        Assert.assertFalse(expectedtext, actualtext.equals("Welcome"));
    }

    @After
    public void closeDriver() {
        driver.close();
    }



}
