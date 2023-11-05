package driverconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
	static  WebDriver driver;
	
	public WebDriver initBrowser(String browsername)
	{
		if(browsername.equals("Chrome"))
		{
			 driver = new ChromeDriver();
			
		}
		
		else if (browsername.equals("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		else {
			
			System.out.println("driver is null");
		}
		return driver; 
		
		
	}
		
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	
	

}