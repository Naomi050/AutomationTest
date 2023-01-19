package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage {
    private WebDriver driver;
    public CustomerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css= "#reorder-item-1827")
    private WebElement Selectproduct;

    @FindBy(css= ".actions  .btn-cart")
    private WebElement ClickButton;

    @FindBy(css = "p.hello")
    private WebElement WelcomeText;

    @FindBy(css= "div.box-content > p > a")
    private WebElement ChangePasswordElement;

    @FindBy(id = "current_password")
    private WebElement CurrentPasswordField;

    @FindBy(id = "password")
    private WebElement PasswordField;

    @FindBy(id = "confirmation")
    private WebElement ConfirmationField;

    @FindBy(css = "[title='Save']")
    private WebElement SaveButton;

    @FindBy(css = "li.success-msg")
    private WebElement MessageText;






    public void setSelectProduct(){
        Selectproduct.click();
    }

    public void ClickWishlistButton(){
        ClickButton.click();
    }

    public String getWelcomeText(){
        return WelcomeText.getText();
    }

    public void ClickChangePasswordElement(){
        ChangePasswordElement.click();
    }

    public void setCurrentPasswordField(String value){
        CurrentPasswordField.sendKeys(value);
    }

    public void setPasswordField(String value){
        PasswordField.sendKeys(value);
    }

    public void setConfirmationField(String value){
        ConfirmationField.sendKeys(value);
    }

    public void clickSaveButton(){
        SaveButton.click();
    }

    public String getMessageText(){
        return MessageText.getText();
    }
}
