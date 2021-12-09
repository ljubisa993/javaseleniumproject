package tests;

import methods.LoginMethods;
import methods.UserProfilePageMethods;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserProfilePage;
import propertyManager.PropertyManager;

public class ShopItem extends BaseCommands{

    public HomePage homePage;
    public LoginPage loginPage;
    public LoginMethods loginMethods;
    public UserProfilePage userProfilePage;
    public UserProfilePageMethods userProfilePageMethods;
    //shop item
    @Test
    public void shopItem()  {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        loginMethods = new LoginMethods(driver);
        userProfilePage = new UserProfilePage(driver);
        userProfilePageMethods = new UserProfilePageMethods(driver);
        loginPage.loadURL();
        loginMethods.login(PropertyManager.getInstance().getGoodUserName(),
                PropertyManager.getInstance().getGoodPassword());
        userProfilePageMethods.shopItem();

        //does BACK HOME appears?
        try{
            homePage.verifyShopping("BACK HOME");

            System.out.println("Successful shopping. Pass");
        } catch (Exception e) {
            System.out.println("Shopping not completed. Fail");
        }
    }
}
