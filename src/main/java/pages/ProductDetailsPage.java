package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

// ProductDetailsPage: POM for product details (30')
public class ProductDetailsPage extends BasePage {
    private By title = By.id("itemTitle");

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAtDetails() {
        return driver.findElement(title).isDisplayed();
    }
}