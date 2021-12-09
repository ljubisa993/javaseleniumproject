package tests;

import methods.LoginMethods;
import org.junit.Test;
import pages.HomePage;
import pages.LoginPage;
import propertyManager.PropertyManager;

public class GoodLoginTest extends BaseCommands{

    public LoginPage loginPage;
    public LoginMethods loginMethods;
    public HomePage homePage;
    //log in with valid credentials
    @Test
    public void goodLogin(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        loginMethods = new LoginMethods(driver);
        loginPage.loadURL();
        loginMethods.login(PropertyManager.getInstance().getGoodUserName(),
                PropertyManager.getInstance().getGoodPassword());
        //when we log in, PRODUCTS appear
        try{
            homePage.verifyLogin("PRODUCTS");

            System.out.println("Logged in. Pass");
        } catch (Exception e) {
            System.out.println("Not logged in. Fail");
        }
    }
}
