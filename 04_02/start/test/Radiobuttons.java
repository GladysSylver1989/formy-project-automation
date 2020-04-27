import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Radiobuttons {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\Chrome\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        /*driver.get("https://formy-project.herokuapp.com/radiobutton");

        WebElement radiobutton1= driver.findElement(By.id("radio-button-1"));
        radiobutton1.click();

        WebElement radiobutton2=driver.findElement(By.cssSelector("input[value='option2']"));
        radiobutton2.click();

        WebElement radiobutton3=driver.findElement(By.xpath("/html/body/div/div[3]/input"));
        radiobutton3.click();*/

        driver.get("https://formy-project.herokuapp.com/checkbox");

        WebElement checkbox1= driver.findElement(By.id("checkbox-1"));
        checkbox1.click();

        WebElement checkbox2=driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();

        WebElement checkbox3=driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkbox3.click();

        driver.quit();
    }
}
