package addtocart.pageobjects;

import org.openqa.selenium.WebDriver;

/**
 * Created by Yahor local on 2/19/2016.
 */
public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
