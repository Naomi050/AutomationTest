package Tests;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LogInPage;
import org.junit.Assert;
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
        HomePage homepage = new HomePage(driver);
        LogInPage loginpage = new LogInPage(driver);
        AccountPage accountPage = new AccountPage(driver);

        homepage.clickAccountButton();
        homepage.clickLoginLink();
        loginpage.setEmailfield("cosmin@fasttrackit.org");
        loginpage.setPasswordfield("123456");
        loginpage.clickSendButton();
        Assert.assertEquals("Hello, Cosmin Fast!", accountPage.getWelcomeText());
        accountPage.clickAccountElement();
        accountPage.clickLogOutElement();
        driver.close();





    }
}
