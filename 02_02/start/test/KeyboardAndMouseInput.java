import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Webdrivers\\Firefox\\geckodriver.exe");

        WebDriver driver=new FirefoxDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name=driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Gladys");
        WebElement button=driver.findElement(By.id("button"));
        button.click(); 

        driver.quit();
    }
}
