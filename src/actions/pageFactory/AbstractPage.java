package pageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Set;


public class AbstractPage {
    private Select select;
    private JavascriptExecutor jsExecutor;
    private WebDriverWait waitExplicit;
    private List<WebElement> elements;
    private WebElement element;
    public Actions action;
    private long shortTimeout = 5;
    private long longTimeout = 30;

    public String getCurrentUrl(WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public void sendkeyToElement(WebDriver driver, WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    public String getElementText(WebDriver driver, WebElement element) {
        return element.getText().trim();
    }

    public boolean isElementDisplayed(WebDriver driver, WebElement element) {
        return element.isDisplayed();
    }

    public void waitForElementVisible(WebDriver driver, WebElement element) {
        waitExplicit = new WebDriverWait(driver, longTimeout);
        waitExplicit.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementClickAble(WebDriver driver, WebElement element){
        waitExplicit = new WebDriverWait(driver, longTimeout);
        waitExplicit.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickToElement(WebDriver driver, WebElement element){
        waitExplicit = new WebDriverWait(driver, longTimeout);
        waitExplicit.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}


