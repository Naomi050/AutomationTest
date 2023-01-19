package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IslaCrossbodyHandbagPage {

    private WebDriver driver;
    public IslaCrossbodyHandbagPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(css = "#options_4_text")
    private WebElement monogrammingField;

    @FindBy(css ="div.add-to-cart-buttons")
    private WebElement AddtoCartButton;




    public void setMonogrammingField(String value){
        monogrammingField.sendKeys(value);
    }

    public void clickAddtoCartButton(){
        AddtoCartButton.click();
    }

}
