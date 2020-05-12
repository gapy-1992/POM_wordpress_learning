package pageObjects.bankguru;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUI.bankguru.RegisterPageUI;

public class RegisterPageObject extends AbstractPage {
    WebDriver driver;

    public RegisterPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage(String loginPageUrl) {
        openURL(driver, loginPageUrl);
    }

    public void inputToEmailTextBox(String email) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, email);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, RegisterPageUI.SUBMIT_BUTTON);
        clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);

    }

    public String getUserIdText() {
        waitForElementVisible(driver, RegisterPageUI.USER_ID_TEXT);
        return getElementText(driver, RegisterPageUI.USER_ID_TEXT);
    }

    public String getPasswordText() {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXT);
        return getElementText(driver, RegisterPageUI.PASSWORD_TEXT);
    }
}
