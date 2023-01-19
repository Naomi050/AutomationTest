package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }



    @FindBy(css = ".skip-account")
    private WebElement AccountButton;


    @FindBy(css = "[title='Log In']")
    private WebElement LoginLink;

    @FindBy(css = ".level0.nav-5")
    private WebElement SaleElement;

    @FindBy(css = "a.product-image")
    private WebElement clickOnProduct;

    @FindBy(css = "body > div > div.page > div.main-container.col1-layout > " +
            "div > div > div.std > div.widget.widget-new-products" +
            " > div.widget-products > ul > li:nth-child(3) > a > img")
    private WebElement ClickOnProduct;

    @FindBy(css= "[title=Register]")
    private WebElement RegisterElement;

    @FindBy(css = "#search")
    private WebElement searchElement;

    @FindBy(css = "button.button.search-button")
    private WebElement searchButtonElement;

    @FindBy(css ="[title='Advanced Search']" )
    private WebElement AdvancedSearchElement;

    @FindBy(css  = "#newsletter")
    private WebElement NewsletterField;

    @FindBy(css = "[title='Subscribe']")
    private WebElement SubscribeElement;


    @FindBy(css = "#map-popup")
    private WebElement ConfirmationMessageText;


    @FindBy(css  = "#select-language")
    private WebElement SelectLanguage;


    @FindBy(css = ".welcome-msg")
    private WebElement WelcomeText;







    public void clickAccountButton(){

        AccountButton.click();
    }

    public void clickLoginLink(){

        LoginLink.click();
    }

    public void clickRegisterElement(){
        RegisterElement.click();
    }

    public void clickSaleElement(){
        SaleElement.click();
    }

    public void clickOnProduct() {
        clickOnProduct.click();
    }

    public void ClickOnProduct(){
        ClickOnProduct.click();
    }

    public void setSearchField(String value){
        searchElement.sendKeys(value);


        }
        public void clickSearchButton(){
        searchButtonElement.click();
        }

        public void clickAdvancedSearch(){
        AdvancedSearchElement.click();
        }

        public void setNewsletterField(String value){
        NewsletterField.sendKeys(value);
        }

        public void clickSubscribedElement(){
        SubscribeElement.click();
        }

        public String ConfirmationText(){
        return ConfirmationMessageText.getText();
        }

        public void setSelectLanguage(String value){
        SelectLanguage.sendKeys(value);
        }

        public String getWelcomeText(){
        return WelcomeText.getText();
        }






}
