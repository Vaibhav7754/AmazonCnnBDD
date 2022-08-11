package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;
import pageobjects.Amazonbase;
import pageobjects.BasePage;
import pageobjects.SearchPage;
@Test
public class StepDefinitions {
    WebDriver driver = initiateDriver();

    public WebDriver initiateDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vaibhavmp\\Downloads\\chromedriver.exe");
        return new ChromeDriver();
    }


    @Given("^The \"([^\"]*)\" page of CNN is opened$")
    public void homePageLoad(String URL) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(URL);
    }


    @When("I select Search from the Screen and enter text")
    public void searchFromHeader() {
        try {
            BasePage basePage = new BasePage(driver);
            basePage.clickOnHeaderSearch();
            basePage.enterSearchInput("India");
            basePage.clickOnSubmitearch();
            basePage.SelectArticle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Given("^The \"([^\"]*)\" page of amazon is opened$")
    public void AmazonhomePage(String url) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get(url);
    }


    @When("Enter text and search for mobile")
    public void searchforMobile() {
        try {
            Amazonbase basePage = new Amazonbase(driver);
            basePage.clickOnHeaderSearch();
            basePage.enterSearchInput("sumsung");
            basePage.clickOnSubmitearch();
            basePage.SelectArticle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @When("select add to cart  and check out")
    public void addtocardMobile() {
        try {
            Amazonbase basePage = new Amazonbase(driver);
            basePage.Addtocard();
            basePage.checkoutmobile();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
