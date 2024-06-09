import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Main {

    private WebDriver driver;

    // This method will be executed before any test method.
    @BeforeClass
    public void setUp() {
        // Set the system property for the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", 
        "~\\documents\\For-Testing\\chromedriver\\chromedriver");
        // Initialize a new instance of ChromeDriver.
        driver = new ChromeDriver();
    }

    // This method contains the actual test.
    @Test
    public void wikipediaTest() {
        try {
            // Navigate to Wikipedia's homepage.
            driver.get("https://www.wikipedia.org/");
            // Create a new instance of the WikipediaHomePage class.
            WikipediaHomePage homePage = new WikipediaHomePage(driver);
            // Perform a search action using the searchInput method.
            homePage.searchInput();
            // Create a new instance of the seleniumPage class.
            SearchResultPage seleniumPage = new SearchResultPage(driver);
            // Perform a check on the Selenium page using seleniumPageCheck method.
            seleniumPage.seleniumPageCheck();
        } catch (Exception e) {
            // Catch any exceptions that occur during the test.
        }
    }

    // This method will be executed after all test methods.
    @AfterClass
    public void teardown() {
        // Close the browser if it's open.
        if (driver != null) {
            driver.quit();
        }
    }
}
