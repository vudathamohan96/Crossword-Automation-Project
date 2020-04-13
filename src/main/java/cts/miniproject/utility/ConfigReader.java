package cts.miniproject.utility;
/**
 * @author Mohan Krishna V
 * Class Created to configure properties and access the paths of Browsers,ExcelSheet and URL of Website.
 */
import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigReader {
	Properties pro;
	/**
	 * Method to load properties.
	 */
	
	public ConfigReader() {
		
		  try {
			File src=new File("./Configuration/Config.property");
			  
			  FileInputStream fis=new FileInputStream(src);
			  
			  pro=new Properties();
			  
			  pro.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is" + e.getMessage());
		} 
			  
	}
	public String getchromepath() {
		String path=pro.getProperty("ChromeDriver");
		return path;
	}
	
	public String getFirefox() {
		String path=pro.getProperty("firefoxDriver");
		return path;
	}
	
	public String getApplicationURL() {
		return pro.getProperty("URL");
	}
	public String getExcelAccess() {
		return pro.getProperty("ExcelData");
		
	}

}
