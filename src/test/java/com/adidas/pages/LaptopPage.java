package com.adidas.pages;

import com.adidas.utilities.BrowserUtils;
import com.adidas.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopPage extends BasePage {
    public LaptopPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Sony vaio i5']")
    public WebElement sonyLaptop;

    @FindBy(xpath = "//a[.='Dell i7 8gb']")
    public WebElement dellLaptop;

    public void clickProduct(String product) {
        switch (product.toLowerCase()) {
            case "sony vaio i5":
                sonyLaptop.click();
                break;
            case "deli i7 8gb":
                dellLaptop.click();
                break;
        }
    }
}
