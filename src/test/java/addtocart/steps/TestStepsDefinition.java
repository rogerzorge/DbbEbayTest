package addtocart.steps;

import addtocart.core.WebDriverInit;
import addtocart.pageobjects.CartPage;
import addtocart.pageobjects.HomePage;
import addtocart.pageobjects.SearchResultPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * Created by Yahor local on 2/19/2016.
 */
public class TestStepsDefinition extends WebDriverInit {

    private SearchResultPage searchResultPage;
    private CartPage cartPage;

    @Given("^I set search request \"([^\"]*)\" and perform search$")
    public void iSetSearchRequestAndPerformSearch (String searchRequest){
        driver.get(HomePage.EBAY_URL);
        searchResultPage = new HomePage(driver)
                .setSearchQuery("iPhone 6S")
                .goToSearchResultPage();
    }

    @When("^I add product to cart and pass to cart$")
    public void iAddItemToCartAndPassToCart(){
        cartPage = searchResultPage.clickOnFirstElement()
                .addToCart()
                .setUserId("roger.zorge@gmail.com")
                .setUserPassw("Zxcv!21@")
                .setStayLoginCheckbox()
                .enterInSystem()
                .goToCart()
                .goToMyEbayPage();
    }

    @Then("^the term query \"([^\"]*)\" should be available in cart$")
    public void theTermQueryShouldBeAvailableInCart(String expectedPhrase){
        assertThat(cartPage.getTextOfItemInCart(),containsString(expectedPhrase));
//        cartPage.setCheckbox()
//                .deleteAll()
//                .deleteConfirm();
    }

}
