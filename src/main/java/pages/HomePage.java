package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// HomePage: POM for eBay home (30')
public class HomePage extends BasePage {
    private By searchBox = By.id("gh-ac");
    private By searchButton = By.id("gh-btn");
    private By advancedLink = By.linkText("Advanced") ;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHome() {
        driver.get("https://www.ebay.com");
    }

    public void search(String keyword) {
        driver.findElement(searchBox).sendKeys(keyword);
        driver.findElement(searchButton).click();
    }

    public void openAdvancedSearch() {
        driver.findElement(advancedLink).click();
    }
}