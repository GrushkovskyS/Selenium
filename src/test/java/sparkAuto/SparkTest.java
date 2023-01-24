package sparkAuto;

import lesson6.MainSpark;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SparkTest extends SparkAbstractTest {



    @Test
    @Order(1)
    @DisplayName("Добавление поста")
    void addPostTest() throws InterruptedException{
//        WebElement webElement5 = getDriver().findElement(By.xpath(".//a[@id=\"headerWriteButton\"]"));
//        webElement5.click();
//        Thread.sleep(10000);
//        WebElement webElement6 = getDriver().findElement(By.xpath(".//input[@class=\"post-form__input_title\"]"));
//        webElement6.sendKeys("Тестовый заголовок");
//        WebElement webElement7 = getDriver().findElement(By.xpath(".//textarea[@class=\"post-form__input_text post-form__input_subtitle\"]"));
//        webElement7.sendKeys("Тестовый абзац");
//        WebElement webElement8 = getDriver().findElement(By.xpath(".//div[@class=\"ce-paragraph cdx-block\"]"));
//        webElement8.sendKeys("Тестовая история");
//        Thread.sleep(6000);
//        WebElement webElement9 = getDriver().findElement(By.xpath(".//button[@id=\"acceptEditorPlaginError\"]"));
//        webElement9.click();
//        WebElement webElement10 = getDriver().findElement(By.xpath(".//div[@class=\"post-form__submit button master\"]"));
//        webElement10.click();
//        Assertions.assertEquals("https://spark.ru/user/149126/blog/103365/testovij-zagolovok", getDriver().getCurrentUrl(),"Не та страница");
        Thread.sleep(3000);
        MainSpark mainSpark =new MainSpark(getDriver());
        mainSpark.writeButton.click();
        Thread.sleep(3000);
        mainSpark.title.sendKeys("Тестовый заголовок");
        Thread.sleep(3000);
        mainSpark.subtitle.sendKeys("Тестовый абзац");
        Thread.sleep(3000);
        mainSpark.block.sendKeys("Тестовая история");
        Thread.sleep(3000);
        mainSpark.acceptPlugin.click();
        Thread.sleep(3000);
        mainSpark.postButton.click();
        Assertions.assertEquals("https://spark.ru/user/149126/blog/103365/testovij-zagolovok", getDriver().getCurrentUrl(),"Не та страница");
    }
    @Test
    @Order(2)
    @DisplayName("Редактирование поста")
    void editPostTest() throws InterruptedException {
//        Thread.sleep(5000);
//        WebElement webElement11 = getDriver().findElement(By.xpath(".//img[@class=\"header-profile__photo\"]"));
//        webElement11.click();
//        Thread.sleep(5000);
//        WebElement webElement12 = getDriver().findElement(By.xpath(".//a[@href=\"/user/149126/blogs\"]"));
//        webElement12.click();
//        Thread.sleep(5000);
//        WebElement webElement13 = getDriver().findElement(By.xpath(".//span[@class=\"post-list-item__menu-toggler fl_r\"]"));
//        webElement13.click();
//        Thread.sleep(5000);
//        WebElement webElement14 = getDriver().findElement(By.xpath(".//a[@class=\"post-list-item__menu-item\"]"));
//        webElement14.click();
//        Thread.sleep(5000);
//        WebElement webElement15 = getDriver().findElement(By.xpath(".//input[@class=\"post-form__input_title\"]"));//1
//        webElement15.sendKeys("Тест2");
//        Thread.sleep(5000);
//        WebElement webElement16 = getDriver().findElement(By.xpath(".//button[@id=\"acceptEditorPlaginError\"]"));//2
//        webElement16.click();
//        Thread.sleep(5000);
//        WebElement webElement17 = getDriver().findElement(By.xpath(".//div[@class=\"post-form__section\"]"));
//        webElement17.click();
//        Thread.sleep(5000);
//        WebElement webElement18 = getDriver().findElement(By.xpath(".//div[@onclick=\"spark.post.save( this );\"]"));
//        webElement18.click();
//        Assertions.assertEquals("https://spark.ru/user/149126/blog/103365/testovij-zagolovoktest2", getDriver().getCurrentUrl(),"Не та страница");
        Thread.sleep(3000);
        MainSpark mainSpark =new MainSpark(getDriver());
        mainSpark.profile.click();
        Thread.sleep(3000);
        mainSpark.blog.click();
        Thread.sleep(3000);
        mainSpark.menu.click();
        Thread.sleep(3000);
        mainSpark.postItem.click();
        Thread.sleep(3000);
        mainSpark.title.sendKeys("Тест2");
        mainSpark.acceptPlugin.click();
        Thread.sleep(3000);
        mainSpark.posfForm.click();
        Thread.sleep(3000);
        mainSpark.postSawe.click();
        Assertions.assertEquals("https://spark.ru/user/149126/blog/103365/testovij-zagolovoktest2", getDriver().getCurrentUrl(),"Не та страница");
    }
    @Test
    @Order(3)
    @DisplayName("Удаление поста")
    void deletePostTest() throws InterruptedException {
//        Thread.sleep(5000);
//        WebElement webElement19 = getDriver().findElement(By.xpath(".//img[@class=\"header-profile__photo\"]"));
//        webElement19.click();
//        Thread.sleep(5000);
//        WebElement webElement20 = getDriver().findElement(By.xpath(".//a[@href=\"/user/149126/blogs\"]"));
//        webElement20.click();
//        Thread.sleep(5000);
//        WebElement webElement21 = getDriver().findElement(By.xpath(".//a[@class=\"posts-list-item__title\"]"));
//        webElement21.click();
//        Thread.sleep(5000);
//        WebElement webElement22 = getDriver().findElement(By.xpath(".//span[@id=\"js-post-removing-button\"]"));
//        webElement22.click();
//        Thread.sleep(5000);
//        WebElement webElement23 = getDriver().findElement(By.xpath(".//span[@class=\"button master\"]"));
//        webElement23.click();
//        Assertions.assertEquals("Тестовый заголовокТест2", getDriver().getTitle(),"Не та страница");
            Thread.sleep(3000);
            MainSpark mainSpark =new MainSpark(getDriver());
            mainSpark.delPost();
            Assertions.assertEquals("Тестовый заголовокТест2", getDriver().getTitle(),"Не та страница");
    }
}
