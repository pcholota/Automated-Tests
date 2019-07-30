package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
    WebDriver driver;

    @FindBy(id="email")
    WebElement mail;

    @FindBy(id="pass")
    @CacheLookup
    WebElement password;

    @FindBy(how = How.ID, using = "loginbutton")
    @CacheLookup
    WebElement loginButton;


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void loginToFacebook(String email, String pass){
        mail.sendKeys(email);
        password.sendKeys(pass);
        loginButton.click();
    }

    public void typeEmail(String email){
        mail.sendKeys(email);
    }

    public void typePassword(String pass){
        password.sendKeys(pass);
    }

    public void clickOnLoginButton(){
        loginButton.click();
    }

}