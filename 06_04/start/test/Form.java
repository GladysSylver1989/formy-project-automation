import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        FormPages formPages=new FormPages();
        formPages.submitForm(driver);

        ConfirmationPages confirmationPages=new ConfirmationPages();
        confirmationPages.waitForAlertBanner(driver);

        assertEquals("The form was successfully submitted!", confirmationPages.getAlertBannerText(driver));

        driver.quit();
    }




}
