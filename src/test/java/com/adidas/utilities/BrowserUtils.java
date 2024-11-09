package com.adidas.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BrowserUtils {

    public static void sleep(int seconds) {
        seconds *= 1000;
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void acceptAlert() {
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    public static void clickElement(WebElement element) {
        element.click();
    }

    public static void enterInput(WebElement element, String input) {
        element.sendKeys(input);
    }

    public static void waitElement(WebElement target) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(target));
    }
}
