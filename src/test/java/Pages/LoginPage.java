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

    @FindBy(xpath = "//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")
    @CacheLookup
    WebElement recoverText;

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

    public void clickOnRecoveryPasswordText(){
        recoverText.click();
    }

}