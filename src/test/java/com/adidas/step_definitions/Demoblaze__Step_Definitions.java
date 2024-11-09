package com.adidas.step_definitions;

import com.adidas.pages.BasePage;
import com.adidas.pages.CartPage;
import com.adidas.pages.LaptopPage;
import com.adidas.pages.PurchasePage;
import com.adidas.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Arrays;

public class Demoblaze__Step_Definitions {

    BasePage basePage = new BasePage();
    LaptopPage laptopPage = new LaptopPage();
    PurchasePage purchasePage = new PurchasePage();
    CartPage cartPage = new CartPage();
    Faker faker = new Faker();

    @Given("user is on the demoblaze page")
    public void user_is_on_the_demoblaze_page() {
        System.out.println("Done in hooks!");
    }
    @When("user navigates to {string} module")
    public void user_navigates_to_module(String module) {
        basePage.clickModule(module);
    }
    @When("user clicks on {string} on laptop page")
    public void user_clicks_on_on_laptop_page(String product) {
        laptopPage.clickProduct(product);
    }
    @When("user clicks on Add to cart and accepts pop up")
    public void user_clicks_on_add_to_cart_and_accepts_pop_up() {
        BrowserUtils.clickElement(purchasePage.addToCart);
        BrowserUtils.sleep(1);
        BrowserUtils.acceptAlert();
    }
    @When("user deletes {string}")
    public void user_deletes(String product) {
        cartPage.deleteProduct(product);
    }
    @When("user clicks on Place order")
    public void user_clicks_on_place_order() {
        BrowserUtils.clickElement(cartPage.placeOrder);
    }
    @When("user enters name")
    public void user_enters_name() {
        BrowserUtils.enterInput(cartPage.nameInput, faker.name().fullName());
    }
    @When("user enters country")
    public void user_enters_country() {
        BrowserUtils.enterInput(cartPage.countryInput, faker.country().name());
    }
    @When("user enters city")
    public void user_enters_city() {
        BrowserUtils.enterInput(cartPage.cityInput, faker.address().city());
    }
    @When("user enters credit card")
    public void user_enters_credit_card() {
        BrowserUtils.enterInput(cartPage.cardInput, faker.numerify("####-####-####-####"));

    }
    @When("user enters month")
    public void user_enters_month() {
        BrowserUtils.enterInput(cartPage.monthInput, "07");
    }
    @When("user enters year")
    public void user_enters_year() {
        BrowserUtils.enterInput(cartPage.yearInput, "2028");
    }
    @When("user clicks on Purchase button")
    public void user_clicks_on_purchase_button() {
        BrowserUtils.clickElement(cartPage.purchaseButton);
    }
    @When("user sees Id and Amount")
    public void user_sees_id_and_amount() {
        System.out.println(cartPage.purchaseInfo.getText());
    }
    @Then("user should be able to see correct amount")
    public void user_should_be_able_to_see_correct_amount() {
        String text = cartPage.purchaseInfo.getText();
        String[] elements = text.split(" ");
        System.out.println(Arrays.toString(elements));
        System.out.println("elements[2] = " + elements[1]);
        System.out.println("elements[3] = " + elements[2]);
        int price = Integer.parseInt(elements[2]);
        Assert.assertEquals(price, 790);
    }
    @Then("user clicks on Ok")
    public void user_clicks_on_ok() {
        BrowserUtils.clickElement(cartPage.okButton);
    }
}
