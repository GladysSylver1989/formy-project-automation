import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropdownMenuButton=driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();

       // WebElement autocompleteItem=driver.findElement(By.id("autocomplete"));
       // autocompleteItem.click();

        WebElement buttons=driver.findElement(By.cssSelector("body > div > div > div > a:nth-child(2)"));
        buttons.click();

        driver.quit();
    }
}
