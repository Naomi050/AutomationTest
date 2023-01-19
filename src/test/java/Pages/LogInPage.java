package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
    private WebDriver driver;
    public LogInPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "email")
    private WebElement emailfield;

    @FindBy(id = "pass")
    private WebElement passwordfield;

    @FindBy(id = "send2")
    private WebElement clickButton;





    public void setEmailfield(String value){

        emailfield.sendKeys(value);
    }

    public void setPasswordfield(String value) {

        passwordfield.sendKeys(value);
    }

    public void clickSendButton() {
        clickButton.click();
    }


}
