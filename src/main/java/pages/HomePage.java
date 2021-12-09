package pages;

import methods.UserProfilePageMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.jws.soap.SOAPBinding;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    By missingUsernameError = By.xpath("//h3[@data-test='error']");
    By missingPasswordError = By.xpath("//h3[@data-test='error']");
    By badCredentialsError = By.xpath("//h3[@data-test='error']");
    By loginSuccess = By.xpath("//div[@class='header_secondary_container']/span[1]");
    By logoutSuccess = By.xpath("//div[@id='login_credentials']/h4");
    By cartNumber = By.id("shopping_cart_container");
    By goHome = By.id("back-to-products");
    By itemName = By.xpath("//a[@id='item_4_title_link']/div[@class='inventory_item_name']");


    public void verifyMissingUsernameLogin(String text){
        String text1 = getText(missingUsernameError);
        System.out.println("Text on page: " + text1);
        System.out.println("Expected text: " + text);
        AssertString(text1, text);
    }
    public void verifyMissingPasswordLogin(String text){
        String text1 = getText(missingPasswordError);
        System.out.println("Tekst na stranici: " + text1);
        System.out.println("Expected text: " + text);
        AssertString(text1, text);
    }
    public void verifyBadCredentialsLogin(String text){
        String text1 = getText(badCredentialsError);
        System.out.println("Text on page: " + text1);
        System.out.println("Expected text: " + text);
        AssertString(text1, text);
    }
    public void verifyLogin(String text){
        String text1 = getText(loginSuccess);
        System.out.println("Text on page: " + text1);
        System.out.println("Expected text: " + text);
        AssertString(text1, text);
    }
    public void verifyLogout(String text){
        String text1 = getText(logoutSuccess);
        System.out.println("Text on page: " + text1);
        System.out.println("Expected text: " + text);
        AssertString(text1, text);
    }
    public void verifyRemovedItemFromCart(String text){
        String text1 = getText(cartNumber);
        System.out.println("Text on page: " + text1);
        System.out.println("Expected text: " + text);
        AssertString(text1,text);
    }
    public void verifyShopping(String text){
        String text1 = getText(goHome);
        System.out.println("Text on pagei: " + text1);
        System.out.println("Expected text: " + text);
        AssertString(text1,text);
    }

    public  String getName1(){
        return getText(itemName);
    }
    public void verifySameName(String text){
        String text1 = getName1();
        System.out.println("Text on page: " + text1);
        System.out.println("Ocekivan tekst: " + text);
        AssertString(text1, text);
    }


}
