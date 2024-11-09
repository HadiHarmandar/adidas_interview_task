package com.adidas.pages;

import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Laptops']")
    public WebElement laptopLink;

    @FindBy(xpath = "//a[normalize-space()='Home (current)']")
    public WebElement homeLink;

    @FindBy(xpath = "//a[@id='cartur']")
    public WebElement cartLink;

    public void clickModule(String module) {
        switch (module.toLowerCase()) {
            case "laptop":
                laptopLink.click();
                BrowserUtils.sleep(1);
                break;
            case "cart":
                cartLink.click();
                break;
            case "home":
                homeLink.click();
                break;
        }
    }
}
