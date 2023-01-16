import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedSearchTest {

    private WebDriver driver = new ChromeDriver();

    @Before
    public void Driver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void AdvancedSearch() {
        driver.findElement(By.cssSelector("[title='Advanced Search']")).click();
        driver.findElement(By.cssSelector("#name")).sendKeys("ROCHIE OFFICE BELLA DONNA");
        driver.findElement(By.cssSelector("#description")).sendKeys("Rochie office din jerse cu guler si" +
                " mansete. Are guler ascutit, maneci lungi, croi tip A si buzunare functionale. Compozitie:" +
                " 85% Poliester, 5% Viscoza, 10% Elastan Instructiuni de intretinere: Curatare-uscata " +
                "Nu uscati automat Temp max-120grade Albirea interzisa Spalare automata-30g " +
                "*Va rugam verificati eticheta produsului inainte de curatare! *Va rugam sa " +
                "retineti ca o usoara discrepanta de culoare ar trebui sa fie acceptabila datorita " +
                "luminii si luminozitatii ecranului. Created by: Florina H");
        driver.findElement(By.cssSelector("#price")).sendKeys("10");
        driver.findElement(By.cssSelector("#price_to")).sendKeys("300");
        driver.findElement(By.cssSelector("[value='14']")).click();
        driver.findElement(By.cssSelector("[value='81']")).click();
        driver.findElement(By.cssSelector("[value='94']")).click();
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();

    }

    @After
    public void closeDriver(){
        driver.close();
    }
}