package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ConcurrentModificationException;

public class CustomerAccountCreatePage {
    private WebDriver driver;
    public CustomerAccountCreatePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "firstname")
    private WebElement firstNameField;


    @FindBy(id = "lastname")
    private WebElement lastNameField;

    @FindBy(id= "email_address")
    private WebElement emailAddressField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmation")
    private WebElement confirmationField;


    @FindBy(css = "#is_subscribed")
    private WebElement clickNewsletter;

    @FindBy(css = "#form-validate > div.buttons-set > button")
    private WebElement registerButton;






    public void setfirstNameField(String value){
        firstNameField.sendKeys(value);
    }


    public void setLastNameField(String value){
        lastNameField.sendKeys(value);
    }

    public void setEmailAddressField(String value){
        emailAddressField.sendKeys(value);
    }

    public void setPasswordField(String value){
        passwordField.sendKeys(value);
    }

    public void setConfirmationField(String value){
        confirmationField.sendKeys(value);
    }

    public void setClickNewsletter(){
        clickNewsletter.click();
    }

    public void clickRegisterButton(){
        registerButton.click();
    }

}
