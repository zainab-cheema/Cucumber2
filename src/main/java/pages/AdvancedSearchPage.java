package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// AdvancedSearchPage: POM for advanced search (30')
public class AdvancedSearchPage extends BasePage {
    private By keywordField = By.id("_nkw");
    private By minPrice = By.id("_udlo");
    private By maxPrice = By.id("_udhi");
    private By submitBtn = By.id("searchBtnLowerLnk");

    public AdvancedSearchPage(WebDriver driver) {
        super(driver);
    }

    public void setKeyword(String kw) {
        driver.findElement(keywordField).sendKeys(kw);
    }

    public void setPriceRange(String min, String max) {
        driver.findElement(minPrice).sendKeys(min);
        driver.findElement(maxPrice).sendKeys(max);
    }

    public void submitSearch() {
        driver.findElement(submitBtn).click();
    }
}