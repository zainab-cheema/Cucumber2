package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

public class CommonSteps {
    // Shared WebDriver instance for all steps
    public static WebDriver driver;
    HomePage home;

    @Given("I am on the eBay homepage")
    public void openHome() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        home = new HomePage(driver);
        home.goToHome();
    }
}