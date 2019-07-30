import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class LogInTest {

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
}
