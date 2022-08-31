import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/romancebotar/Documents/ChromeDriver/chromedriver");
        WebDriver webDriver;
        webDriver = new ChromeDriver();

        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        webDriver.get("https://gamesport.com/ru/landing");

        WebElement button = webDriver.findElement(By.xpath("//button[@onclick='oneRubleButtonClick()']"));

        button.click();
        Thread.sleep(3000);

        webDriver.findElement(By.xpath("//input[@type='email']")).sendKeys("cxc08@mail.ru", Keys.ENTER);
        Thread.sleep(3000);

        webDriver.findElement(By.xpath("//body/div[@id='app']/main[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/label[1]/div[1]/span[1]")).click();
        webDriver.findElement(By.xpath("//body/div[@id='app']/main[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[3]/div[1]/label[1]/div[1]/span[1]")).click();
        Thread.sleep(3000);

        webDriver.get("https://gamesport.com/ru/account/step/profile");

        webDriver.findElement(By.xpath("//input[@id='MazPhoneNumberInput-5_phone_number']")).sendKeys("9222565342");
        webDriver.findElement(By.xpath("//button[@class='form-landing-login__button button button_contained _ripple']")).click();

        Thread.sleep(30000);
        webDriver.quit();

        /*webDriver.get("https://gamesport.com/ru/account/step/profile");
        WebElement button1 = webDriver.findElement(By.xpath("//button[@class='form-landing-login__button button button_contained _ripple']"));
        button1.click();
         */
    }
}