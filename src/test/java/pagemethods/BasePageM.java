package pagemethods;

import org.openqa.selenium.WebDriver;

import pageobjects.BasePage;
import pageobjects.SearchPage;

public class BasePageM {
    
    public void searchFromHeader(WebDriver driver, String search_text) throws Exception {
        BasePage basePage = new BasePage(driver);
        basePage.clickOnHeaderSearch();
        basePage.enterSearchInput(search_text);
        basePage.clickOnSubmitearch();
        SearchPage searchPage = new SearchPage(driver);
        searchPage.validatePageLoad();
    }
}
