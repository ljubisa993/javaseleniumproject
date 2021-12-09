package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginMethods extends LoginPage {
    public LoginMethods (WebDriver driver){
        super(driver);
    }

    public LoginPage loginTryWithEmptyName(String password){
        fillPasswordField(password);
        clickLoginButton();
        return this;
    }

    public LoginPage loginTryWithEmptyPassword(String username){
        fillUsernameField(username);
        clickLoginButton();
        return this;
    }

    public LoginPage loginTryWithBadCredentials(String username, String password){
        fillUsernameField(username);
        fillPasswordField(password);
        clickLoginButton();
        return this;
    }

    public LoginPage login(String username, String password){
        fillPasswordField(password);
        fillUsernameField(username);
        clickLoginButton();
        return this;
    }
}
