package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.Wrapper;

public class SearchPage {
    protected WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchPageValElem = By.id("searchResults");


    public void validatePageLoad() {
        Wrapper.waitForElemToBePresent(driver, searchPageValElem);
    }
   
}
