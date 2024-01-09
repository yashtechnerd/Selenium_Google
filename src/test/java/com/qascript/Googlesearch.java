import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googlesearch {

    public static void performGoogleSearch(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashwanth.s\\Downloads\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());

        // Assertion for page title containing "Google"
        Assert.assertTrue("Page title is not correct", driver.getTitle().contains("Google"));

        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("Selenium Java");
        searchInput.submit(); // Assuming the 'submit' action is for the search input form.

        WebDriverWait wait = new WebDriverWait(driver, 10);
        // Example of waiting for the search results using a different condition
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div#search")));

        // Further actions/assertions on search results or other elements can be added here

        driver.quit(); // Close the browser after the test.
    }
}
