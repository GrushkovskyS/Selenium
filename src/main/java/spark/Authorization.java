package spark;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Authorization {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options =new ChromeOptions();
        //options.addArguments("--incognito");
        options.addArguments("start-maximized");
        // options.addArguments("--headless"); сам браузер небудет запущен

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://spark.ru");

        WebElement webElement1 = driver.findElement(By.xpath(".//a[@href=\"/auth\"]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id=\"login_email\"]"));
        webElement2.sendKeys("sam144@mail.ru");
        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id=\"login_password\"]"));
        webElement3.sendKeys("s212121m");
        WebElement webElement4 = driver.findElement(By.xpath(".//input[@class=\"button\"]"));
        webElement4.click();
        driver.quit();

    }
}
