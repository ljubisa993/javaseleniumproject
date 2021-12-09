package methods;

import org.openqa.selenium.WebDriver;
import pages.UserProfilePage;

public class UserProfilePageMethods extends UserProfilePage {
    public UserProfilePageMethods(WebDriver driver) {
        super(driver);
    }



    public UserProfilePage logout(){
        hoverClickMenu();
        go_logout();
        return this;
    }

    public UserProfilePage removeItemFromCart(){
        addToCart();
        goToCart();
        removeItem();
        return this;
    }



    public UserProfilePage shopItem()  {
        addToCart();
        goToCart();
        goToCheckout();
        fillFirstName();
        fillLastName();
        fillPostal();
        continueFromCheckout();
        finishShopping();
        return this;
    }

    public UserProfilePage shopItemAndCheckName(){
        addToCart();
        goToCart();
        return this;
    }
}
