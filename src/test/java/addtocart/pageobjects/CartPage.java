package addtocart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yahor_Faliazhynski on 2/19/2016.
 */
public class CartPage extends BasePage {

    @FindBy(xpath = "//div[@class='result-set-r']/div[1]//a[@class='vip item-title']")
    private WebElement firstElementInCartTitle;

    @FindBy(xpath = "//div[@class='result-set-r']/div[2]//a[@class='vip item-title']")
    private WebElement secondElementInCartTitle;

    @FindBy(xpath = "//div[@id='watchlist']//input[@class='bulk-select']")
    private WebElement allCheckbox;

    @FindBy(xpath = ".//*[@id='watchlist']//div[@class='bulk-btns']/a[1]")
    private WebElement deleteButton;

    @FindBy(id = "delCustpBtnSave")
    private WebElement deleteConfirmButton;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public String getTextOfItemInCart() {
        return firstElementInCartTitle.getText();
    }

    public CartPage setCheckbox() {
        allCheckbox.click();
        return this;
    }

    public CartPage deleteAll() {
        deleteButton.click();
        return this;
    }

    public CartPage deleteConfirm() {
        deleteConfirmButton.click();
        return this;
    }

}
