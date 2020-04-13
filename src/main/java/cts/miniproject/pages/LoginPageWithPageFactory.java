package cts.miniproject.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * <h1>Login Page Factory<h1>
 * @author Mohan Krishna V
 *
 */

public class LoginPageWithPageFactory {

	WebDriver driver;

	@FindBy(how=How.ID,using="user_session_email")
	@CacheLookup
	WebElement username;

	@FindBy(how=How.XPATH,using="//input[@id='user_session_password']")
	@CacheLookup
	WebElement password;

	@FindBy(how=How.XPATH,using="//input[@id='user_session_submit']")
	@CacheLookup
	WebElement submit_button;
	
	@FindBy(how=How.XPATH,using="//a[@href=\'http://crosswordbookawards.com/\' ]")
	@CacheLookup
	WebElement AwardPage;
	
	@FindBy(how=How.XPATH,using="")
	@CacheLookup
	WebElement logout;
	
	/**
	 * LoginPageWithPageFactory()
	 * This Method is to Launch WebDrivers.
	 * @param driver -String
	 */
	public LoginPageWithPageFactory(WebDriver driver) {
		this.driver=driver;
	}
   
	/**
	 * typeUserNameAndPassword()
	 * This Method is used to Enter username & Password.
	 * @param userid -String
	 * @param pass -String
	 */
	public void typeUserNameAndPassword(String userid,String pass) {
		username.sendKeys(userid);
		password.sendKeys(pass);
	}
    
	/**
	 * clcikOnLoginButton()
	 * This method is used to Click Login Button.
	 */
	public void clickOnLoginButton() {
		submit_button.click();
	}
	
	/**
	 * clickOnLogoutButton()
	 * This method is used to Click Logout Button.
	 */
	public void clickOnLogoutButton() {
		      logout.click();
	}
   
	/**
	 * AwardPageButton()
	 * This method is used to click Award page Button.
	 */
	public void AwardPageButton() {
	      AwardPage.click();
}


}
