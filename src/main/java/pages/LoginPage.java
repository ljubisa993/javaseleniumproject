package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import propertyManager.PropertyManager;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By usernameFieldBy = By.id("user-name");
    By passwordFieldBy = By.id("password");
    By loginButtonBy = By.id("login-button");
    private String URL = PropertyManager.getInstance().getURL();

    public void fillUsernameField(String text){
        writeText(usernameFieldBy, text);
    }
    public void fillPasswordField(String text){
        writeText(passwordFieldBy, text);
    }
    public void clickLoginButton(){
        clickElement(loginButtonBy);
    }
    public void loadURL(){
        driver.get(URL);
    }
}
