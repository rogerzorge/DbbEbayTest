package addtocart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yahor local on 2/19/2016.
 */
public class ProductDetailsPage extends BasePage {

    @FindBy(id = "watchLink")
    private WebElement addToCartButton;

    @FindBy(id = "gh-cart-i")
    private WebElement openCartButton;

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public SignInPage addToCart() {
        addToCartButton.click();
        return PageFactory.initElements(driver, SignInPage.class);
    }

    public PreCartPage goToCart() {
        openCartButton.click();
        return PageFactory.initElements(driver, PreCartPage.class);
    }


}
