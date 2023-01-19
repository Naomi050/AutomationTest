package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElizabethKnitTopPage {
    private WebDriver driver;
    public ElizabethKnitTopPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "p.required")
    private WebElement messageText;

    @FindBy(css = "[alt='Royal Blue']")
    private WebElement selectColor;

    @FindBy(css = "#swatch80")
    private WebElement selectSize;

    @FindBy(css = ".add-to-cart")
    private WebElement AddtoCartbutton;





    public String RequiredmessageText(){
        return messageText.getText();
    }

    public void setSelectColor(){
        selectColor.click();
    }

    public void setSelectSize(){
        selectSize.click();
    }

    public void clickAddtoCartbutton(){
        AddtoCartbutton.click();
    }
}
