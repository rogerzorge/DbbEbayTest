package addtocart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yahor local on 2/19/2016.
 */
public class HomePage extends BasePage {

    public static final String EBAY_URL = "http://ebay.com";

    @FindBy(id = "gh-ac")
    private WebElement searchBox;

    @FindBy(id = "gh-btn")
    private WebElement searchButton;

    @FindBy(id = "gh-cat")
    private WebElement chooseCategory;

    @FindBy(xpath = "//select[@id='gh-cat']/option[15]")
    private WebElement electronicDevicesOption;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public HomePage setSearchQuery(String searchQuery) {
        searchBox.sendKeys(searchQuery);
        return this;
    }

    public SearchResultPage goToSearchResultPage() {
        searchButton.click();
        return PageFactory.initElements(driver, SearchResultPage.class);
    }

    public HomePage setSearchCategory() {
        chooseCategory.click();
        electronicDevicesOption.click();
        return this;
    }

}
