package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    public void waitVisibility(By element){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(element));
    }

    public void clickElement(By element){
        waitVisibility(element);
        driver.findElement(element).click();
    }
    public void writeText(By element, String text){
        waitVisibility(element);
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }
    public String getText(By element){
        waitVisibility(element);
        return driver.findElement(element).getText();
    }



    public void hoverAndClick(By element){
        Actions action = new Actions(driver);
        waitVisibility(element);
        action.moveToElement(driver.findElement(element)).click().build().perform();
    }
    public void AssertString(String a, String b){
        Assert.assertEquals(a,b);
    }

}
