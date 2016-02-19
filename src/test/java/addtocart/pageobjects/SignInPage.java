package addtocart.pageobjects;

import org.omg.CORBA.StringHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yahor local on 2/19/2016.
 */
public class SignInPage extends BasePage {

    @FindBy(id = "userid")
    private WebElement idTextbox;

    @FindBy(id = "pass")
    private WebElement passwdTextbox;

    @FindBy(id = "sgnBt")
    private WebElement enterInSystemButton;

    @FindBy(id = "csi")
    private WebElement stayLoginCheckbox;

    public SignInPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public SignInPage setUserId(String userId) {
        idTextbox.sendKeys(userId);
        return this;
    }

    public SignInPage setUserPassw(String userPasswd) {
        passwdTextbox.sendKeys(userPasswd);
        return this;
    }

    public ProductDetailsPage enterInSystem() {
        enterInSystemButton.click();
        return PageFactory.initElements(driver, ProductDetailsPage.class);
    }

    public SignInPage setStayLoginCheckbox() {
        stayLoginCheckbox.click();
        return this;
    }

}
