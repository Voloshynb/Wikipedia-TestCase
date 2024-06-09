import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikipediaHomePage {

    // Locate the search input field using the XPath defined in Locators.
    @FindBy(xpath = Locators.SEARCHINPUT_STRING)
    WebElement searchInput;

    // Locate the search submit button using the XPath defined in Locators.
    @FindBy(xpath = Locators.SEARCHSUBMIT_STRING)
    WebElement searchSubmit;

    private WebDriver driver;

    // Constructor to initialize WebDriver and PageFactory.
    public WikipediaHomePage(WebDriver driver) {
        this.driver = driver;
        // Initialize WebElements defined with @FindBy annotations.
        PageFactory.initElements(driver, this);
    }

    // Method to perform a search for "Selenium" on Wikipedia.
    public void searchInput() {
        // Create a WebDriverWait instance with a timeout of 10 seconds.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the search input field is visible.
        wait.until(ExpectedConditions.visibilityOf(searchInput));
        // Enter "Selenium" into the search input field.
        searchInput.sendKeys("Selenium");
        // Submit the search form.
        searchSubmit.submit();
    }
}
