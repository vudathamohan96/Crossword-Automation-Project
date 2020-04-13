package cts.miniproject.utility;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * <h1>Crossword Browser Factory<h1>
 * @author V Mohan Krishna

 */
public class BrowserFactory {
	public WebDriver driver;
	public WebDriver startBrowser(String browserName,String url) {
		 ConfigReader config=new ConfigReader();
		 
		if(browserName.equalsIgnoreCase("chrome")) {
      
			System.setProperty("webdriver.chrome.driver",config.getchromepath());
			driver=new ChromeDriver();  
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", config.getFirefox());
			driver=new FirefoxDriver();	
		}

		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
