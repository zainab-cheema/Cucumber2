package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import org.openqa.selenium.WebElement;

// SearchResultsPage: interacts with filters & items (30')
public class SearchResultsPage extends BasePage {
    private By itemLinks = By.cssSelector(".s-item__link");
    private By newFilter = By.xpath("//span[text()='New']");

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean resultsContain(String keyword) {
        return driver.getPageSource().toLowerCase().contains(keyword.toLowerCase());
    }

    public void applyNewFilter() {
        driver.findElement(newFilter).click();
        // wait for filter to apply
        waitForTitleContains("New");
    }

    public void clickFirstItem() {
        List<WebElement> items = driver.findElements(itemLinks);
        items.get(0).click();
    }
}