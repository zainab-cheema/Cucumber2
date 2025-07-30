package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.ProductDetailsPage;
import static org.junit.Assert.*;

public class ProductDetailsSteps {
    WebDriver driver;
    HomePage home;
    SearchResultsPage results;
    ProductDetailsPage details;

    @Given("I search for {string} on the homepage")  // reuse step
    public void searchFromHome(String kw) {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
        driver = new ChromeDriver();
        home = new HomePage(driver);
        home.goToHome();
        home.search(kw);
        results = new SearchResultsPage(driver);
    }

    @When("I click the first result")
    public void clickFirst() {
        results.clickFirstItem();
        details = new ProductDetailsPage(driver);
    }

    @Then("I should see the product details page")
    public void verifyDetails() {
        assertTrue(details.isAtDetails());
        driver.quit();
    }
}
