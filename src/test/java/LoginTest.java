import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private  WebDriver driver = new ChromeDriver();
    @Before
    public void Driver(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");



    }
    @Test
    public void loginWithValidData(){


        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector("p.hello"));

        String expectedText = "Hello, Cosmin Fast!";
        String actualText = welcomeTextElement.getText();

        if (actualText.equals(expectedText)){
            System.out.println("S-a logat cu success!");
        }else
            System.err.println("Nu s-a logat. ");

        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title='Log Out']")).click();
        driver.close();





    }
}
