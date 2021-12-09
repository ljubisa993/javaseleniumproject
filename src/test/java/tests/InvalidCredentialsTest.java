package tests;

import methods.LoginMethods;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import propertyManager.PropertyManager;

public class InvalidCredentialsTest extends BaseCommands{

    public LoginPage loginPage;
    public HomePage homePage;
    public LoginMethods loginMethods;
    //try to log in with invalid credentials
    @Test

    public void badLogin(){
        loginPage = new LoginPage(driver);
        loginMethods = new LoginMethods(driver);
        homePage = new HomePage(driver);
        loginPage.loadURL();
        loginMethods.loginTryWithBadCredentials(PropertyManager.getInstance().getBadUserName(),
                PropertyManager.getInstance().getBadPassword());
        try{
            homePage.verifyBadCredentialsLogin("Epic sadface: Username and " +
                    "password do not match any user in this service");
            System.out.println("Not logged in. Pass");
        } catch (Exception e) {
            System.out.println("Logged in. Fail ");
        }
    }
}
