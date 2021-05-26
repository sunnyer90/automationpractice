package stepDefinations;

import conf.base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pageObjects.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class stepDefination extends base {
    public WebDriver driver;
    public String orderReferenceNumber;

    @Given("^I Initialize the browser$")
    public void initialize_browser() throws FileNotFoundException, IOException{
        driver = initializeWebDriver();
    }

    @When("^I Navigate to Automation Practice Website$")
    public void navigate_automation_practice(){
        driver.get(prop.getProperty("application"));
    }

    @Then("^I click on sign in button$")
    public void sign_in_button_landing_page(){
        LandingPage lp = new LandingPage(driver);
        lp.getSignInButton().click();
    }

    @Then("^I enter username as \"([^\"]*)\" and password as \"([^\"]*)\" and click on Sign-in button$")
    public void enter_credentials(String username, String password){
        AuthenticationPage ap = new AuthenticationPage(driver);
        ap.getEmailAddressTextbox().sendKeys(username);
        ap.getPasswordTextbox().sendKeys(password);
        ap.getSignInButton().click();
    }

    @Then("^I select the tshirt and proceed to checkout$")
    public void select_tshirt_proceed_to_checkout(){
        Actions actions = new Actions(driver);
        MyAccountPage map = new MyAccountPage(driver);
        map.getTshirtsTab().click();
        actions.moveToElement(map.getTshirtImage()).perform();
        map.getAddToCartButton().click();
        map.getproceedToCheckoutButton().click();
    }

    @Then("^I click on Proceed to checkout on Shopping Cart Summary page$")
    public void proceed_to_checkout_shopping_cart_summary(){
        ShoppingCartSummaryPage scs = new ShoppingCartSummaryPage(driver);
        scs.getProceedToCheckoutButton().click();
    }

    @Then("^I click on Proceed to checkout on Addresses page$")
    public void proceed_to_checkout_addresses_page(){
        AddressesPage ap = new AddressesPage(driver);
        ap.getProceedToCheckoutButton().click();
    }

    @Then("^I agree to terms of service and click on proceed to checkout button$")
    public void proceed_to_checkout_shipping_page(){
        ShippingPage sp = new ShippingPage(driver);
        sp.getAgreementCheckbox().click();
        sp.getProceedToCheckoutButton().click();
    }

    @Then("^I select payment method as pay by bank wire$")
    public void pay_by_bak_wire(){
        PaymentMethodPage pmp = new PaymentMethodPage(driver);
        pmp.getPayByBankWire().click();
    }

    @Then("^I click on confirm order button on Order Summary page and navigated to Order confirmation screen.$")
    public void confirm_order(){
        OrderConfirmationPage ocp = new OrderConfirmationPage(driver);
        ocp.getConfirmOrderButton().click();
    }

    @Then("^I retrieve the order reference number and navigated to order history screen$")
    public void referenceNumberRetrieve(){
        OrderConfirmationPage ocp = new OrderConfirmationPage(driver);
        var completeText = ocp.getOrderReferenceNumber().getText();
        orderReferenceNumber = completeText.substring(completeText.indexOf("reference")+10, completeText.indexOf("reference")+19).trim();
        ocp.getBackToOrdersLink().click();
    }

    @Then("^I validate if my order is present in Order History Page$")
    public void orderHistoryPage(){
        driver.findElement(By.xpath("//td/a[contains(text(), '"+orderReferenceNumber+"')]"));
    }

    @Then("^I click on My Personal information button$")
    public void personal_information_button(){
        LandingPage lp = new LandingPage(driver);
        lp.getPersonalInformationButton().click();
    }

    @Then("^I change my firstname to \"([^\"]*)\" and enter password as \"([^\"]*)\" and click on Save button$")
    public void pay_by_bak_wire(String new_name, String password){
        PersonalInformationPage pip = new PersonalInformationPage(driver);
        pip.getFirstNameTextbox().clear();
        pip.getFirstNameTextbox().sendKeys(new_name);
        pip.getOldPasswordTextbox().sendKeys(password);
        pip.getSaveButton().click();
    }

    @And("^Close the browser session$")
    public void close_browser(){
        driver.quit();
    }
}
