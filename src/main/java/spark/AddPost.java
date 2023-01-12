package spark;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AddPost {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options =new ChromeOptions();
        //options.addArguments("--incognito");
        options.addArguments("start-maximized");
        // options.addArguments("--headless"); сам браузер небудет запущен

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://spark.ru");

        try {
            Thread.sleep(6000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement webElement = driver.findElement(By.xpath(".//button[@id=\"accept-cookies\"]"));
        webElement.click();
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
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement webElement5 = driver.findElement(By.xpath(".//a[@id=\"headerWriteButton\"]"));
        webElement5.click();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement webElement6 = driver.findElement(By.xpath(".//input[@class=\"post-form__input_title\"]"));
        webElement6.sendKeys("Тестовый заголовок");
        WebElement webElement7 = driver.findElement(By.xpath(".//textarea[@class=\"post-form__input_text post-form__input_subtitle\"]"));
        webElement7.sendKeys("Тестовый абзац");
        WebElement webElement8 = driver.findElement(By.xpath(".//div[@class=\"ce-paragraph cdx-block\"]"));
        webElement8.sendKeys("Тестовая история");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        WebElement webElement9 = driver.findElement(By.xpath(".//button[@id=\"acceptEditorPlaginError\"]"));
        webElement9.click();
        WebElement webElement10 = driver.findElement(By.xpath(".//div[@class=\"post-form__submit button master\"]"));
        webElement10.click();
        driver.quit();

    }

}
