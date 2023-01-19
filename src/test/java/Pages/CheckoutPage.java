package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css= "[title='Continue Shopping']")
    private WebElement ClickToContinueShopping;

    @FindBy(css = "ul.messages")
    private WebElement ConfirmationMessageText;

    @FindBy(css = ".skip-cart")
    private WebElement CartElement;

    @FindBy(css ="a.button")
    private WebElement CheckoutButton;

    @FindBy(css = "#header-cart > div.minicart-wrapper > div.minicart-actions > ul > li > a")
    private WebElement RegisterandCheckout;

    @FindBy(css = "#onepage-guest-register-button")
    private WebElement ContinueButton;

    @FindBy(css = "[name='billing[firstname]']")
    private WebElement FirstNameField;

    @FindBy(css = "[name='billing[middlename]']")
    private WebElement MiddleNameField;

    @FindBy(css ="[name='billing[lastname]']")
    private WebElement LastNameField;

    @FindBy(css = "[name='billing[company]']")
    private WebElement CompanyField;

    @FindBy(css = "[name='billing[email]']")
    private WebElement emailField;

    @FindBy(css= "[name='billing[city]'")
    private WebElement CityField;

    @FindBy(css = "[name='billing[region_id]']")
    private WebElement RegionField;

    @FindBy(css = "[name='billing[postcode]']")
    private WebElement PostCodeField;

    @FindBy(css = "[name='billing[telephone]']")
    private WebElement TelephoneField;



    @FindBy(css = "[onclick='billing.save()']")
    private WebElement SaveButton;

    @FindBy(css = ".validation-advice")
    private WebElement errorMessageText;







    public void ClickToContinueShopping(){
        ClickToContinueShopping.click();
    }

    public String ConfirmationmessageText(){
        return ConfirmationMessageText.getText();
    }

    public void clickCartElement(){
        CartElement.click();
    }

    public void clickCheckoutButton(){
        CheckoutButton.click();
    }

    public void clickRegisterandCheckout(){
        RegisterandCheckout.click();
    }

    public void clickContinueButton(){
        ContinueButton.click();
    }

    public void setFirstNameField(String value){
        FirstNameField.sendKeys(value);
    }

    public void setMiddleNameField(String value){
        MiddleNameField.sendKeys(value);
    }

    public void setLastNameField(String value){
        LastNameField.sendKeys(value);
    }

    public void setCompanyField(String value){
        CompanyField.sendKeys(value);
    }

    public void setEmailField(String value){
        emailField.sendKeys(value);
    }

    public void setCityField(String value){
        CityField.sendKeys(value);
    }

    public void setRegionField(String value){
        RegionField.sendKeys(value);
    }
    public void setPostCodeField(String value){
        PostCodeField.sendKeys(value);

    }
    public void setTelephoneField(String value){
        TelephoneField.sendKeys(value);
    }



    public void clickSaveButton(){
        SaveButton.click();
    }

    public String getErrorMessageText(){
        return errorMessageText.getText();
    }
}


