package tests;

import methods.LoginMethods;
import methods.UserProfilePageMethods;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserProfilePage;
import propertyManager.PropertyManager;

public class LogoutTest extends BaseCommands{

    public LoginPage loginPage;
    public LoginMethods loginMethods;
    public HomePage homePage;
    public UserProfilePage userProfilePage;
    public UserProfilePageMethods userProfilePageMethods;
    //logout after logging in
    @Test
    public void logout() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        loginMethods = new LoginMethods(driver);
        userProfilePage = new UserProfilePage(driver);
        userProfilePageMethods = new UserProfilePageMethods(driver);
        loginPage.loadURL();
        loginMethods.login(PropertyManager.getInstance().getGoodUserName(),
                PropertyManager.getInstance().getGoodPassword());
        userProfilePageMethods.logout();

        //are we back on login page?
        try{
            homePage.verifyLogout("Accepted usernames are:");

            System.out.println("Logged out. Pass");
        } catch (Exception e) {
            System.out.println("Logged in. Fail");
        }
    }
}
