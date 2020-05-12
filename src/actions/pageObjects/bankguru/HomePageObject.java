package pageObjects.bankguru;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.bankguru.HomePageUI;

public class HomePageObject extends AbstractPage {
    WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
        System.out.println("Show me your driver:" + driver.toString());
    }

    public boolean isGreetingMessageDisplayed() {
        waitForElementVisible(driver, HomePageUI.WELCOME_MESSAGE_TEXT);
        return isElementDisplayed(driver, HomePageUI.WELCOME_MESSAGE_TEXT);
    }
}
