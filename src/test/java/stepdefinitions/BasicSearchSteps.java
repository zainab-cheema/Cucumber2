package stepdefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.SearchResultsPage;
import static org.junit.Assert.*;

public class BasicSearchSteps {
    HomePage home;
    SearchResultsPage results;

    @When("I search for {string}")
    public void doSearch(String kw) {
        home = new HomePage(CommonSteps.driver);
        home.search(kw);
        results = new SearchResultsPage(CommonSteps.driver);
    }

    @Then("I see results for {string}")
    public void verifyResults(String kw) {
        assertTrue(results.resultsContain(kw));
        CommonSteps.driver.quit();
        CommonSteps.driver = null; // Reset driver for next test
    }
}