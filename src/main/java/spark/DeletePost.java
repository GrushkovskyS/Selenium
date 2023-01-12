package spark;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DeletePost {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
        options.addArguments("start-maximized");
        // options.addArguments("--headless"); сам браузер небудет запущен

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://spark.ru");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement1 = driver.findElement(By.xpath(".//a[@href=\"/auth\"]"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id=\"login_email\"]"));
        webElement2.sendKeys("sam144@mail.ru");
        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id=\"login_password\"]"));
        webElement3.sendKeys("s212121m");
        WebElement webElement4 = driver.findElement(By.xpath(".//input[@class=\"button\"]"));
        webElement4.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement5 = driver.findElement(By.xpath(".//img[@class=\"header-profile__photo\"]"));
        webElement5.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement6 = driver.findElement(By.xpath(".//a[@href=\"/user/148794/blogs\"]"));
        webElement6.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement7 = driver.findElement(By.xpath(".//a[@class=\"posts-list-item__title\"]"));
        webElement7.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement8 = driver.findElement(By.xpath(".//span[@id=\"js-post-removing-button\"]"));
        webElement8.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement9 = driver.findElement(By.xpath(".//span[@class=\"button master\"]"));
        webElement9.click();
        driver.quit();
    }
}
