package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmationPage {
    public WebDriver driver;

    @FindBy(xpath="//button/span[contains(text(), \"I confirm my order\")]")
    WebElement confirmOrderButton;

    @FindBy(xpath="//*[@id=\"center_column\"]/div")
    WebElement orderReferenceNumber;

    @FindBy(xpath="//a[@title = 'Back to orders']")
    WebElement backToOrdersLink;

    public OrderConfirmationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getConfirmOrderButton(){
        return confirmOrderButton;
    }

    public WebElement getOrderReferenceNumber(){
        return orderReferenceNumber;
    }

    public WebElement getBackToOrdersLink(){
        return backToOrdersLink;
    }
}
