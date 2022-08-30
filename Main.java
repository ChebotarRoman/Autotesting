import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/romancebotar/Documents/ChromeDriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        driver = new ChromeDriver();


        driver.get("https://gamesport.com/ru/landing");

        WebElement button = driver.findElement(By.xpath("//button[@onclick='oneRubleButtonClick()']"));

        button.click();
    }
}