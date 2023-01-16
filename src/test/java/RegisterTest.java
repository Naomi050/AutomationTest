import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
     private WebDriver driver = new ChromeDriver();
    @Before
    public void Driver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void getRegisterTest(){

        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title=Register]")).click();
        driver.findElement(By.id("firstname")).sendKeys("Austin");
        driver.findElement(By.id("middlename")).sendKeys("Mary");
        driver.findElement(By.id("lastname")).sendKeys("Julya");
        driver.findElement(By.id("email_address")).sendKeys("austin.mary9@yahoo.com");
        driver.findElement(By.id("password")).sendKeys("acelasinume");
        driver.findElement(By.id("confirmation")).sendKeys("acelasinume");
        driver.findElement(By.cssSelector("#is_subscribed")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();

        WebElement welcomeText = driver.findElement(By.cssSelector("p.hello"));
        String expectedText = "Hello, Austin Mary Julya!" ;
        String actualText = welcomeText.getText();
        Assert.assertEquals(expectedText,actualText);

        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > " +
                "div > div.col-main > div.my-account > div > div:nth-child(4) > " +
                "div.col2-set > div.col-1 > div > div.box-content > p > a")).click();
        driver.findElement(By.cssSelector("#current_password")).sendKeys("acelasinume");
        driver.findElement(By.cssSelector("#password")).sendKeys("acelasinume2");
        driver.findElement(By.cssSelector("#confirmation")).sendKeys("acelasinume2");
        driver.findElement(By.cssSelector("[title='Save']")).click();

        WebElement newpassword = driver.findElement(By.cssSelector("body > div > div.page > div.main-container." +
                "col2-left-layout > div > div.col-main > div.my-account > div > ul > li > ul > li > span"));
        Assert.assertTrue(newpassword.isDisplayed());
        driver.close();









    }
}
