package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ATaleOfToCitiesPage {

    private WebDriver driver;

    public ATaleOfToCitiesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "#links_20")
    private WebElement SelecttheProduct;

    public void setSelecttheProduct() {
        SelecttheProduct.click();
    }



    @FindBy(css = ".add-to-cart-buttons")
    private WebElement AddtoCartButton;


    public void clickAddtoCartButton() {
        AddtoCartButton.click();

    }
}

