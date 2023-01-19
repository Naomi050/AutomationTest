package Pages;

import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CatalogSearchAdvancedPage {
    private WebDriver driver;
    public CatalogSearchAdvancedPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "#name")
    private WebElement TheNameProduct;

    @FindBy(css = "#description")
    private WebElement theDescriptionProduct;


    @FindBy(css = "#price")
    private WebElement thePriceProduct;

    @FindBy(css = "#price_to")
    private WebElement thePriceTo;

    @FindBy(css  = "[value='14']")
    private WebElement theProductColor;

    @FindBy(css = "[value='81']")
    private WebElement theProductSize;

    @FindBy(css = "[value='94']")
    private WebElement theProductGender;

    @FindBy(css = "#form-validate > div.buttons-set > button")
    private WebElement SearchButton;






    public void setTheNameProduct(String value){
        TheNameProduct.sendKeys(value);
    }
    public void setTheDescriptionProduct(String value){
        theDescriptionProduct.sendKeys(value);
    }

    public void setThePriceProduct(String value ){
        thePriceProduct.sendKeys(value);
    }

    public void setThePriceTo(String value){
        thePriceTo.sendKeys(value);
    }

    public void setTheProductColor(){
        theProductColor.click();
    }

    public void setTheProductSize(){
        theProductSize.click();
    }

    public void setTheProductGender(){
        theProductGender.click();
    }

    public void clickSearchButton(){
        SearchButton.click();
    }

}
