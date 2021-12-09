package tests;

import methods.LoginMethods;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import propertyManager.PropertyManager;

public class NoPasswordTest extends BaseCommands{

    public LoginPage loginPage;
    public LoginMethods loginMethods;
    public HomePage homePage;

    @Test
    //try to log in without password
    public void noPasswordTest()  {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        loginMethods = new LoginMethods(driver);
        loginPage.loadURL();
        loginMethods.loginTryWithEmptyPassword(PropertyManager.getInstance().getGoodUserName());

        try{
            homePage.verifyMissingPasswordLogin("Epic sadface: Password is required");
            System.out.println("Not logged in. Pass");
        } catch (Exception e) {
            System.out.println("Logged in. Fail");
        }
    }
}
