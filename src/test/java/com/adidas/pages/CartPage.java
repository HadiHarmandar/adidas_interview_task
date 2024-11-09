package com.adidas.pages;

import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//td[.='Dell i7 8gb']/..//a[.='Delete']")
    public WebElement deleteDell;

    @FindBy(xpath = "//button[text()='Place Order']")
    public WebElement placeOrder;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameInput;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement countryInput;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@id='card']")
    public WebElement cardInput;

    @FindBy(xpath = "//input[@id='month']")
    public WebElement monthInput;

    @FindBy(xpath = "//input[@id='year']")
    public WebElement yearInput;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseButton;

    @FindBy(xpath = "//p[@class='lead text-muted ']")
    public WebElement purchaseInfo;

    @FindBy(xpath = "//button[text()='OK']")
    public WebElement okButton;

    public void deleteProduct(String product) {
        switch (product) {
            case "Deli i7 8gb":
                deleteDell.click();
                BrowserUtils.sleep(1);
                break;
        }
    }
}
