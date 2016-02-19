package addtocart.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Yahor local on 2/19/2016.
 */
public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@id='ListViewInner']/li[1]/h3/a")
    private WebElement firstFoundElement;

    @FindBy(xpath = "//*[@id='ListViewInner']/li[2]/h3/a")
    private WebElement secondFoundElement;

    @FindBy(xpath = "//*[@id='ListViewInner']/li[3]/h3/a")
    private WebElement thirdFoundElement;

    public SearchResultPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public ProductDetailsPage clickOnFirstElement() {
        firstFoundElement.click();
        return PageFactory.initElements(driver, ProductDetailsPage.class);
    }

}
