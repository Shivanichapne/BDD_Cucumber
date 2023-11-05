package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProximusHomePage {
	WebDriver driver;
	
	WebDriverWait wait;
	
	@FindBy(xpath= "//a[@data-tms-link-name='Packs']")
	WebElement Packs;
	
	
	public ProximusHomePage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}
	
	
	
	public String getTitleOfPage()
	{
		String titleOfPage= driver.getTitle();
		
		return titleOfPage;
	}
	
	public void click() {
		
		Packs.click();
	}
}
