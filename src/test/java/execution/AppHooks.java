package execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverconfig.DriverFactory;
import driverconfig.DriverFactory2;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {

	WebDriver driver;
	
	DriverFactory2 df;
	@Before
	public void launchBrowser() throws IOException {
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		System.out.println(path);

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);
		
		

		String browsername = prop.getProperty("browser");
		
        System.out.println(browsername);
        
		 df = new DriverFactory2();

		driver = df.initBrowser(browsername);
		
		driver.manage().window().maximize();
	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}