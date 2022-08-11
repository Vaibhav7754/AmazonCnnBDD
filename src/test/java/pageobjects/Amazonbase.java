package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import common.Wrapper;

public class Amazonbase {
	protected WebDriver driver;

    public Amazonbase(WebDriver driver) {
        this.driver = driver;
    }

 
    private By header_search = By.xpath("//input[@id='twotabsearchtextbox']");
    private By search_input = By.xpath("//input[@id='twotabsearchtextbox']");
    private By submit_search = By.xpath("//div/span/input[@id='nav-search-submit-button']");
    private By select_article = By.xpath("//h2/a/span[@class='a-size-medium a-color-base a-text-normal']");
    private By Addtocard= By.xpath("//div[@aria-checked='false']/a/i");
    private By checkout = By.xpath("//div[@class='a-row a-spacing-top-small']/span[@class='a-button a-button-primary attach-primary-button attach-button-large attach-checkout-button']");


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
    public void Addtocard()  throws Exception {
    	Wrapper.clickElement(driver,Addtocard);
    }
    public void checkoutmobile()  throws Exception {
    	Wrapper.clickElement(driver,checkout);
    }
    
}