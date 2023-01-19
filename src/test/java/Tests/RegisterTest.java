package Tests;

import Pages.CustomerAccountCreatePage;
import Pages.CustomerPage;
import Pages.HomePage;
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

        HomePage homePage = new HomePage(driver);
        CustomerAccountCreatePage customerAccountPage = new CustomerAccountCreatePage(driver);
        CustomerPage customerPage =  new CustomerPage(driver);


        homePage.clickAccountButton();
        homePage.clickRegisterElement();
        customerAccountPage.setfirstNameField("Austin");
        customerAccountPage.setLastNameField("Julya");
        customerAccountPage.setEmailAddressField("austin.mary104@yahoo.com");
        customerAccountPage.setPasswordField("acelasinume");
        customerAccountPage.setConfirmationField("acelasinume");
        customerAccountPage.setClickNewsletter();
        customerAccountPage.clickRegisterButton();
        Assert.assertEquals("Hello, Austin Julya!", customerPage.getWelcomeText());
        customerPage.ClickChangePasswordElement();
        customerPage.setCurrentPasswordField("acelasinume");
        customerPage.setPasswordField("109876");
        customerPage.setConfirmationField("109876");
        customerPage.clickSaveButton();
        Assert.assertEquals("The account information has been saved.", customerPage.getMessageText());












    }
}
