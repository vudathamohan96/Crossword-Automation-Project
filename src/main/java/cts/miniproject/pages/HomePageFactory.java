/**
 * <h1>Home Page Factory<h1>

 * @author V Mohan Krishna
 
 *
 */

package cts.miniproject.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageFactory {
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='search-input']")
	@CacheLookup
	WebElement searchbox;
	
	@FindBy(how=How.XPATH,using="//input[@class='search-go']")
	@CacheLookup
	WebElement SearchButton;
	
	@FindBy(how=How.XPATH,using="//a[@style xpath='1']")
	@CacheLookup
	WebElement HomeButton;
	
	/**
	 * typebook()
	 * This Method is used to Enter Book Name In Search Box.
	 * @param BookName
	 */
	 public void typebook(String BookName) {
		   searchbox.sendKeys(BookName);
	   }
	
	 /**
	  * ClickSearch()
	  * This Method is used to Click the Search Button.
	  */
	   public void ClickSearch() {
		   SearchButton.click();
	   }
	  
	   /**
	    * ClickHome()
	    * This Method is used Click the home Button. 
	    */
	   public void ClickHome() {
		   HomeButton.click();
	   }
	

}
