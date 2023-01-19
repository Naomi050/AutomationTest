package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CantStopItByShearerPage {
    private WebDriver driver;
    public CantStopItByShearerPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#links_15")
    private WebElement SelecTheFieldProduct;

    @FindBy(css="#qty" )
    private WebElement selectQty;

    @FindBy(css =".add-to-cart-buttons")
    private WebElement AddtoCartButton;




    public void clickthefieldProduct(){
        SelecTheFieldProduct.click();
    }

    public void setSelectQty(String value){
        selectQty.sendKeys(value);
    }

    public void clickAddtoCartButton(){
        AddtoCartButton.click();
    }
}
