package sparkAuto;

import io.github.bonigarcia.wdm.WebDriverManager;
import lesson6.MainSpark;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import spark.MyWebDriverEventListener;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class SparkAbstractTest {

  // private static WebDriver driver;
    public static EventFiringWebDriver eventDriver; //Подключаем Allure

    @BeforeAll
     static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options =new ChromeOptions();
        //options.addArguments("--incognito");
        options.addArguments("start-maximized");
        // options.addArguments("--headless"); сам браузер небудет запущен

//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        eventDriver = new EventFiringWebDriver (new ChromeDriver(options));
        eventDriver.register(new MyWebDriverEventListener());
        eventDriver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @BeforeEach
/*    void getPage(){
        Assertions.assertDoesNotThrow(()-> driver.navigate().to("https://spark.ru"),"Страница не доступна");
    }*/
//    void authorizationTest() throws InterruptedException{
//
//        getDriver().get("https://spark.ru");
//        Thread.sleep(10000);
//        WebElement webElement1 = getDriver().findElement(By.xpath(".//a[@href=\"/auth\"]"));
//        webElement1.click();
//        Thread.sleep(6000);
//        WebElement webElement2 = getDriver().findElement(By.xpath(".//input[@id=\"login_email\"]"));
//        webElement2.sendKeys("sam144550@gmail.com");
//        WebElement webElement3 = getDriver().findElement(By.xpath(".//input[@id=\"login_password\"]"));
//        webElement3.sendKeys("m212121s");
//        WebElement webElement4 = getDriver().findElement(By.xpath(".//input[@class=\"button\"]"));
//        webElement4.click();
//        Assertions.assertEquals("https://spark.ru/", getDriver().getCurrentUrl(),"Не та страница");
//    }
    void authorizationTest() throws InterruptedException{
        getDriver().get("https://spark.ru");
        Thread.sleep(3000);
        MainSpark mainSpark =new MainSpark(getDriver());
        mainSpark.auth.click();
        Thread.sleep(3000);
        mainSpark.login.sendKeys("sam144550@gmail.com");
        Thread.sleep(3000);
        mainSpark.password.sendKeys("m212121s");
        Thread.sleep(3000);
        mainSpark.loginButton.click();
        Assertions.assertEquals("https://spark.ru/", getDriver().getCurrentUrl(),"Не та страница");

    }

    @AfterAll
    static void close(){
       eventDriver.quit();
    }
    @AfterEach
    public void checkBrowser(){
        List<LogEntry> allLogRows = getDriver().manage().logs().get(LogType.BROWSER).getAll();
        if (allLogRows.isEmpty()){
            if (allLogRows.size() > 0){
                allLogRows.forEach(logEntry -> {
                    System.out.println(logEntry.getMessage());
                });
            }
        }
    }



    public static WebDriver getDriver(){
        return eventDriver;
    }
}
