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
        public void AddProducts(){

        driver.findElement(By.cssSelector("#search")).sendKeys("book");
        driver.findElement(By.cssSelector("button.button.search-button")).click();
        driver.findElement(By.cssSelector("[alt='A Tale of Two Cities']")).click();
        driver.findElement(By.cssSelector("#links_20")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > " +
                "div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button")).click();
        driver.findElement(By.cssSelector("[title='Continue Shopping']")).click();
        driver.findElement(By.cssSelector("#search")).sendKeys("music");
        driver.findElement(By.cssSelector("button.button.search-button")).click();
        driver.findElement(By.cssSelector("#product-collection-image-560")).click();
        driver.findElement(By.cssSelector("#links_15")).click();
        driver.findElement(By.cssSelector("#qty")).sendKeys("4");
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > " +
                "div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();
        driver.close();





        }


    }

