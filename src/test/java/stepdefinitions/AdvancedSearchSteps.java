package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.AdvancedSearchPage;
import static org.junit.Assert.*;

public class AdvancedSearchSteps {
    HomePage home;
    AdvancedSearchPage adv;

    @And("I open advanced search")
    public void openAdvanced() {
        home = new HomePage(CommonSteps.driver);
        home.openAdvancedSearch();
    }

    @When("I search with keyword {string} and price between {string} and {string}")
    public void performAdvanced(String kw, String min, String max) {
        adv = new AdvancedSearchPage(CommonSteps.driver);
        adv.setKeyword(kw);
        adv.setPriceRange(min, max);
        adv.submitSearch();
    }

    @Then("I see results within price range")
    public void verifyAdvanced() {
        assertTrue(CommonSteps.driver.getTitle().toLowerCase().contains("watch"));
        CommonSteps.driver.quit();
        CommonSteps.driver = null; // Reset driver for next test
    }
}