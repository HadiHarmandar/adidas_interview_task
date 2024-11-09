Feature: Demoblaze "Add to cart" feature

  Background: User is on demoblaze page
    Given user is on the demoblaze page

  Scenario: Adding product to cart
    When user navigates to "Laptop" module
    And user clicks on "Sony vaio i5" on laptop page
    And user clicks on Add to cart and accepts pop up
    And user navigates to "Home" module
    And user navigates to "Laptop" module
    And user clicks on "Deli i7 8gb" on laptop page
    And user clicks on Add to cart and accepts pop up
    And user navigates to "Cart" module
    And user deletes "Deli i7 8gb"
    And user clicks on Place order
    And user enters name
    And user enters country
    And user enters city
    And user enters credit card
    And user enters month
    And user enters year
    And user clicks on Purchase button
    And user sees Id and Amount
    Then user should be able to see correct amount
    And user clicks on Ok