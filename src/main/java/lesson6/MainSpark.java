package lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainSpark extends AbstractPage {
// Авторизация
    @FindBy(xpath = ".//a[@href=\"/auth\"]")
    public WebElement auth;

    @FindBy(xpath = ".//input[@id=\"login_email\"]")
    public WebElement login;

    @FindBy(xpath = ".//input[@id=\"login_password\"]")
    public WebElement password;

    @FindBy(xpath = ".//input[@class=\"button\"]")
    public WebElement loginButton;

    //Публикация нового поста
    @FindBy(xpath = ".//a[@id=\"headerWriteButton\"]")
    public WebElement writeButton;

    @FindBy(xpath = ".//input[@class=\"post-form__input_title\"]" )
    public WebElement title;

    @FindBy(xpath = ".//textarea[@class=\"post-form__input_text post-form__input_subtitle\"]")
    public WebElement subtitle;

    @FindBy(xpath =".//div[@class=\"ce-paragraph cdx-block\"]" )
    public  WebElement block;

    @FindBy(xpath = ".//button[@id=\"acceptEditorPlaginError\"]")
    public  WebElement acceptPlugin;

    @FindBy(xpath = ".//div[@class=\"post-form__submit button master\"]")
    public WebElement postButton;

    @FindBy(xpath = ".//img[@class=\"header-profile__photo\"]")
    public WebElement profile;

    @FindBy(xpath = ".//a[@href=\"/user/149126/blogs\"]")
    public WebElement blog;

    @FindBy(xpath = ".//span[@class=\"post-list-item__menu-toggler fl_r\"]")
    public WebElement menu;

    @FindBy(xpath = ".//a[@class=\"post-list-item__menu-item\"]")
    public WebElement postItem;

    @FindBy(xpath = ".//div[@class=\"post-form__section\"]")
    public WebElement posfForm;

    @FindBy(xpath = ".//div[@onclick=\"spark.post.save( this );\"]")
    public WebElement postSawe;

    @FindBy(xpath = ".//a[@class=\"posts-list-item__title\"]")
    public WebElement listItem;

    @FindBy(xpath = ".//span[@id=\"js-post-removing-button\"]")
    public WebElement remov;

    @FindBy(xpath = ".//span[@class=\"button master\"]")
    public WebElement removMaster;

    public MainSpark(WebDriver driver) {
        super(driver);
    }
// С этими двумя моментами надо разбираться. String?
    public void loginInn (){
        Actions loginIn = new Actions(getDriver());
        loginIn
                .click(this.auth)
                .pause(5000l)
                .sendKeys(this.login, "sam144550@gmail.com")
                .pause(5000l)
                .sendKeys(this.password,"m212121s")
                .pause(5000l)
                .click(this.loginButton)
                .build()
                .perform();
    }

    public void newPost(){
        Actions newPost = new Actions(getDriver());
        newPost
                .click(this.writeButton)
                .pause(5000l)
                .sendKeys(this.title,"Тестовый заголовок")
                .sendKeys(this.subtitle,"Тестовый абзац")
                .sendKeys(this.block,"Тестовая история")
                .click(this.acceptPlugin)
                .pause(5000l)
                .click(this.postButton)
                .build()
                .perform();

    }
// Не убобно, так как не видно на какой строке прирываетя.
    public void delPost(){
        Actions delPost = new Actions(getDriver());
        delPost
                .pause(3000l)
                .click(this.profile)
                .pause(3000l)
                .click(this.blog)
                .pause(5000l)
                .click(this.listItem)
                .pause(5000l)
                .click(this.remov)
                .pause(5000l)
                .click(this.removMaster)
                .build()
                .perform();

    }
}
