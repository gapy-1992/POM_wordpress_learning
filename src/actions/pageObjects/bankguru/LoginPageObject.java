package pageObjects.bankguru;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.bankguru.LoginPageUI;

public class LoginPageObject extends AbstractPage {
    WebDriver driver;

    public LoginPageObject(WebDriver driver) {
        this.driver = driver;
        System.out.println(driver.toString());
    }

    public void clickToHereLink() {
        waitForElementClickAble(driver, LoginPageUI.HERE_LINK);
        clickToElement(driver, LoginPageUI.HERE_LINK);
    }

    public void inputToUserIDTextBox(String value) {
        waitForElementVisible(driver, LoginPageUI.USER_ID_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.USER_ID_TEXTBOX, value);
    }

    public void inputToPasswordTextBox(String value) {
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, value);
    }

    public void clickToLoginButton() {
        waitForElementClickAble(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
    }

    public String getLoginPageUrl() {
        return getCurrentUrl(driver);
    }
}
