import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultPage {
    
    // Locate the page header element using the XPath defined in Locators.
    @FindBy(xpath = Locators.PAGEHEADER_STRING)
    WebElement PageHeader;

    private WebDriver driver;

    // Constructor to initialize WebDriver and PageFactory.
    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
        // Initialize WebElements defined with @FindBy annotations.
        PageFactory.initElements(driver, this);
    }

    // Method to check the Selenium page.
    public void seleniumPageCheck() {
        // Create a WebDriverWait instance with a timeout of 10 seconds.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Wait until the PageHeader element is visible.
        wait.until(ExpectedConditions.visibilityOf(PageHeader));
        
        // Get the title of the current page.
        String pageTitle = driver.getTitle();
        // Check if the title matches "Selenium - Wikipedia".
        if (pageTitle.equals("Selenium - Wikipedia")) {
            System.out.println("The title: " + pageTitle + " shows successfully");
        } else {
            System.out.println("Page not Found. Failed!");
        }
    }
}
