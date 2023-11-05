package driverconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory2 {
	public  WebDriver driver;
	  
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
		
		public WebDriver initBrowser(String browsername)
		{
			if(browsername.equalsIgnoreCase("Chrome"))
			{
				 tlDriver.set(new ChromeDriver()) ;
				
			}
			
			else if (browsername.equals("firefox"))
			{
				 tlDriver.set( new FirefoxDriver());
			}
			
			
			return getDriver(); 
			
			
		}
			
		public static synchronized WebDriver getDriver()
		{
			return tlDriver.get();
		}

}
