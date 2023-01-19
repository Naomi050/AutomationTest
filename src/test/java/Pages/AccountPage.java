package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }



    @FindBy(css ="p.hello")
    private WebElement WelcomeTextElement;

    @FindBy(css = ".skip-account")
    private WebElement accountElement;

    @FindBy(css = "[title='Log Out']")
    private WebElement LogOutElement;

    public String getWelcomeText(){
       return WelcomeTextElement.getText();
    }

    public void clickAccountElement(){
        accountElement.click();
    }

    public void clickLogOutElement(){
        LogOutElement.click();

    }


}
