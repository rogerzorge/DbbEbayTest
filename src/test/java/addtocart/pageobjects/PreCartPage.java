package addtocart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yahor_Faliazhynski on 2/19/2016.
 */
public class PreCartPage extends BasePage {

    @FindBy(xpath = ".//*[@id='empty-sc']/div/div/ul/li[2]/a")
    private WebElement openMyEbayButton;

    public PreCartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public CartPage goToMyEbayPage() {
        openMyEbayButton.click();
        return PageFactory.initElements(driver, CartPage.class);
    }

}
