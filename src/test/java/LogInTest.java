import Pages.LoginPage;
import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LogInTest {

    //I should use @Before here

    @Test
    public void LogInWithCorrectLoginData(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);

//        Enter your correct login data in place of Strings "correctEmail" and "correctPassword"
        loginPage.loginToFacebook("correctEmail","correctPassword");

        driver.quit();
    }
    @Test
    public void LogInWithNotCorrectLoginData(){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

//        //library that generates fake data
//        Faker faker = new Faker();

        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        loginPage.loginToFacebook("notCorrectEmail", "notCorrectPassword");

        ExpectedConditions.urlContains("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");


    }
}
