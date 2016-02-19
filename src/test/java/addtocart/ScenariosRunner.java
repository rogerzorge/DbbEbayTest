package addtocart;

import addtocart.core.WebDriverInit;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by Yahor local on 2/19/2016.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {
                "pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        }
)

public class ScenariosRunner {

    @BeforeClass
    public static void initSelenium(){
        WebDriverInit.init();
    }
    @AfterClass
    public static void closeSelenium(){
        WebDriverInit.close();
    }

}
