package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondLoginPage {
    WebDriver driver;

    @FindBy(className = "fb_logo img sp_XWJdzZnoeA1 sx_ba923f")
    WebElement fbLogo;

    @FindBy(className = "_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy")
    WebElement createNewAccountBtn;

    @FindBy(id = "email")
    WebElement emailTv;

    @FindBy(id = "pass")
    WebElement passTv;

    @FindBy(id = "loginbutton")
    WebElement logInBtn;

    @FindBy(linkText = "https://www.facebook.com/recover/initiate/?ars=facebook_login")
    WebElement recoverAccount;

    public SecondLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeEmail(String emial){
        emailTv.sendKeys(emial);
    }
    public void typePassword(String pass){
        passTv.sendKeys(pass);
    }
    public void clickLogInButton(){
        logInBtn.click();
    }
    public void clickRecoverAccountText(){
        recoverAccount.click();
    }
    public void createNewAccountButton(){
        createNewAccountBtn.click();
    }
    public void clickFacebookLogo(){
        fbLogo.click();
    }
}
