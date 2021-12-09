package pages;

import dataCreation.DataCreation;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.xml.crypto.Data;

public class UserProfilePage extends BasePage{

    public UserProfilePage(WebDriver driver){
        super(driver);
    }
    By buttonMenu = By.id("react-burger-menu-btn");
    By logout = By.id("logout_sidebar_link");
    By addItemToCart = By.id("add-to-cart-sauce-labs-backpack");
    By shoppingCart = By.id("shopping_cart_container");
    By removeItemFromCart = By.id("remove-sauce-labs-backpack");
    By checkout = By.id("checkout");
    By firstNameField = By.id("first-name");
    By lastNameField = By.id("last-name");
    By postalCodeField = By.id("postal-code");
    By finishShopping = By.id("finish");
    By continueShopping = By.id("continue");



    public void hoverClickMenu(){
        hoverAndClick(buttonMenu);
    }
    public void go_logout(){
        clickElement(logout);
    }
    public void addToCart(){ clickElement(addItemToCart);
    }
    public void goToCart(){clickElement(shoppingCart);}
    public void removeItem(){clickElement(removeItemFromCart);}
    public void goToCheckout() { clickElement(checkout);
    }
    public void continueFromCheckout(){
        clickElement(continueShopping);
    }
    public void fillFirstName(){
        writeText(firstNameField, DataCreation.getFirstNameFaker());
    }
    public void fillLastName(){
        writeText(lastNameField, DataCreation.getLastNameFaker());
    }
    public void fillPostal(){
        writeText(postalCodeField, DataCreation.getZipFaker());
    }
    public void finishShopping(){
        clickElement(finishShopping);
    }




}
