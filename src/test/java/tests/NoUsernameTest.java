package tests;

import methods.LoginMethods;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import propertyManager.PropertyManager;

public class NoUsernameTest extends BaseCommands{

    public LoginPage loginPage;
    public LoginMethods loginMethods;
    public HomePage homePage;

    @Test
    //try to log in without username
    public void noUsernameTest()  {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        loginMethods = new LoginMethods(driver);
        loginPage.loadURL();
        loginMethods.loginTryWithEmptyName(PropertyManager.getInstance().getGoodPassword());

        try{
            homePage.verifyMissingUsernameLogin("Epic sadface: Username is required");
            System.out.println("Not logged in. Pass");
        } catch (Exception e) {
            System.out.println("Logged in. Fail");
        }
    }
}
