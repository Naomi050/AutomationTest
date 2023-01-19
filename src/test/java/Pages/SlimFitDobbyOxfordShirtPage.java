package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SlimFitDobbyOxfordShirtPage {
    private WebDriver driver;

    public SlimFitDobbyOxfordShirtPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "a.product-image")
    private WebElement clickOnProduct;

    @FindBy(css = "[alt='Blue']")
    private WebElement selectColor;

    @FindBy(css = "#option81")
    private WebElement selectSize;

    @FindBy(css ="a.link-wishlist" )
    private WebElement WishlistLink;





    public void clickOnProduct(){
        clickOnProduct.click();
    }

    public void setSelectColor(){
        selectColor.click();
    }

    public void setSelectSize(){
        selectSize.click();
    }

    public void ClickWishlistLink(){
        WishlistLink.click();
    }
}
