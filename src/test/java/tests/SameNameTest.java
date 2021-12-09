package tests;

import methods.LoginMethods;
import methods.UserProfilePageMethods;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.UserProfilePage;
import propertyManager.PropertyManager;

public class SameNameTest extends BaseCommands{
    public HomePage homePage;
    public LoginPage loginPage;
    public LoginMethods loginMethods;
    public UserProfilePage userProfilePage;
    public UserProfilePageMethods userProfilePageMethods;
    //check is item you add to cart actually in cart
    @Test
    public void sameNameInCart(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        loginMethods = new LoginMethods(driver);
        userProfilePage = new UserProfilePage(driver);
        userProfilePageMethods = new UserProfilePageMethods(driver);
        loginPage.loadURL();
        loginMethods.login(PropertyManager.getInstance().getGoodUserName(),
                PropertyManager.getInstance().getGoodPassword());
        userProfilePageMethods.shopItemAndCheckName();
        //checking does item in cart has name - Sauce Labs Backpack
        try{
            homePage.verifySameName("Sauce Labs Backpack");

            System.out.println("Same name. Pass");
        } catch (Exception e) {
            System.out.println("Name is different. Fail");
        }
    }
}
