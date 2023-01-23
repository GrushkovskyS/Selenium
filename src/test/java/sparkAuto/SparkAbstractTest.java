package sparkAuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class SparkAbstractTest {

   private static WebDriver driver;

    @BeforeAll
     static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options =new ChromeOptions();
        //options.addArguments("--incognito");
        options.addArguments("start-maximized");
        // options.addArguments("--headless"); сам браузер небудет запущен

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @BeforeEach
/*    void getPage(){
        Assertions.assertDoesNotThrow(()-> driver.navigate().to("https://spark.ru"),"Страница не доступна");
    }*/
    void authorizationTest() throws InterruptedException{

        getDriver().get("https://spark.ru");
        Thread.sleep(10000);
        WebElement webElement1 = getDriver().findElement(By.xpath(".//a[@href=\"/auth\"]"));
        webElement1.click();
        Thread.sleep(6000);
        WebElement webElement2 = getDriver().findElement(By.xpath(".//input[@id=\"login_email\"]"));
        webElement2.sendKeys("sam144550@gmail.com");
        WebElement webElement3 = getDriver().findElement(By.xpath(".//input[@id=\"login_password\"]"));
        webElement3.sendKeys("m212121s");
        WebElement webElement4 = getDriver().findElement(By.xpath(".//input[@class=\"button\"]"));
        webElement4.click();
        Assertions.assertEquals("https://spark.ru/", getDriver().getCurrentUrl(),"Не та страница");
    }

    @AfterAll
    static void close(){
       driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
