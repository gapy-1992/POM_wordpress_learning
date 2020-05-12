package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPageObject extends AbstractPage {
    WebDriver driver;

    public loginPageObject(WebDriver driver) {
        this.driver = driver;
    }

    //Page factory
    @FindBy(how = How.XPATH, using = "//a[text()='here']")
    private WebElement hereLink;

    @FindBy(how = How.ID_OR_NAME, using = "uid")
    private  WebElement userIDTextBox;

    @FindBy(how = How.ID_OR_NAME, using = "password")
    private  WebElement passwordTextBox ;

    @FindBy(how = How.ID_OR_NAME, using = "btnLogin")
    private  WebElement loginButton ;

    public void clickToHereLink() {
        waitForElementClickAble(driver,hereLink);
        clickToElement(driver,hereLink);
    }

}
