package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;
    @FindBy(name = "username")
    public WebElement txt_filedUsername;
    @FindBy(name = "password")
    public WebElement txt_filedPassword;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUsername(String user) {
        txt_filedUsername.sendKeys(user);
    }

    public void setPassword(String pass) {
        txt_filedPassword.sendKeys(pass);
    }

    public void loginClick() {
        loginButton.click();
    }

}
