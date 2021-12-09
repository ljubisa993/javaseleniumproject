package testSuite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({InvalidCredentialsTest.class,
GoodLoginTest.class, LogoutTest.class, NoPasswordTest.class, NoUsernameTest.class, RemoveItemFromCartTest.class,
    ShopItem.class, SameNameTest.class})

public class TestSuite {
}
