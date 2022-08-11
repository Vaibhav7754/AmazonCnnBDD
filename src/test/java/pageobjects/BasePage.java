package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Wrapper;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

 
    private By header_search = By.className("search-icon");
    private By search_input = By.id("header-search-bar");
    private By submit_search = By.xpath("//input[@name='q']/following-sibling::button");
    private By select_article = By.xpath("//div[@data-zjs-rank='2']/h3[@class='cnn-search__result-headline']/a");


    public void clickOnHeaderSearch() throws Exception {
        
        Wrapper.waitForElemToBePresent(driver, header_search);
        Wrapper.clickElement(driver, header_search);
    }

    public void enterSearchInput(String text_to_enter) throws Exception {
        Wrapper.enterText(driver, search_input, text_to_enter);
    }

    public void clickOnSubmitearch() throws Exception {
        Wrapper.clickElement(driver, submit_search);
    }
    public void SelectArticle()  throws Exception {
    	Wrapper.clickElement(driver,select_article);
    }
    
}
