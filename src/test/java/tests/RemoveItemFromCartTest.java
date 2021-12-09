package tests;

import methods.LoginMethods;
import methods.UserProfilePageMethods;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserProfilePage;
import propertyManager.PropertyManager;

public class RemoveItemFromCartTest extends BaseCommands{

    public HomePage homePage;
    public LoginPage loginPage;
    public UserProfilePage userProfilePage;
    public UserProfilePageMethods userProfilePageMethods;
    public LoginMethods loginMethods;

    @Test

    public void removeItem()  {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        userProfilePage = new UserProfilePage(driver);
        userProfilePageMethods = new UserProfilePageMethods(driver);
        loginMethods = new LoginMethods(driver);
        loginPage.loadURL();
        loginMethods.login(PropertyManager.getInstance().getGoodUserName(),
                PropertyManager.getInstance().getGoodPassword());

        userProfilePageMethods.removeItemFromCart();

        //item is out of cart if cart doesn't show number
        try{
            homePage.verifyRemovedItemFromCart("");

            System.out.println("Item is removed from cart. Pass");
        } catch (Exception e) {
            System.out.println("Item is still in cart. Fail");
        }
    }
}
