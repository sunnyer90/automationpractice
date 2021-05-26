Feature: Validate if customer is successfully able to order a tshirt and able to see in Order history

Scenario Outline: Validate if customer is successfully able to order a tshirt and able to see in Order history

    Given I Initialize the browser
    When I Navigate to Automation Practice Website
    Then I click on sign in button
    And I enter username as "<Username>" and password as "<Password>" and click on Sign-in button
    Then I select the tshirt and proceed to checkout
    And I click on Proceed to checkout on Shopping Cart Summary page
    And I click on Proceed to checkout on Addresses page
    And I agree to terms of service and click on proceed to checkout button
    And I select payment method as pay by bank wire
    And I click on confirm order button on Order Summary page and navigated to Order confirmation screen.
    And I retrieve the order reference number and navigated to order history screen
    Then I validate if my order is present in Order History Page
    And Close the browser session

    Examples:

        |Username                    | Password   |
        |sunny.mittal.146@gmail.com  | Test@123   |


    Scenario Outline: Update Firstname in My Account section

        Given I Initialize the browser
        When I Navigate to Automation Practice Website
        Then I click on sign in button
        And I enter username as "<Username>" and password as "<Password>" and click on Sign-in button
        And I click on My Personal information button
        Then I change my firstname to "<new_name>" and enter password as "<Password>" and click on Save button
        And Close the browser session


        Examples:

            |Username                    | Password   | new_name |
            |sunny.mittal.146@gmail.com  | Test@123   | Mittal |