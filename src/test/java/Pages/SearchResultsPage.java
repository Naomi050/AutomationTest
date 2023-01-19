package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private WebDriver driver;
    public SearchResultsPage( WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (css = "#product-collection-image-370")
    private WebElement ProductElement;

    @FindBy(css = "[alt='A Tale of Two Cities']")
    private WebElement bookProductElement;

    @FindBy(css = "#product-collection-image-560")
    private WebElement musicPrductElement;




    public void clickToProduct(){
        ProductElement.click();
    }

    public void clickToBookProduct(){
        bookProductElement.click();
    }

    public void clickTOMusicProduct(){
        musicPrductElement.click();
    }
}
