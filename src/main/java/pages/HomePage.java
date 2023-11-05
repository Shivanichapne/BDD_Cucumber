package pages;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	WebDriver driver;
	
	WebDriverWait wait;
	
	@FindBy(xpath = "//*[@id='nav-cart']") 
	WebElement cartIcon;
	
	
	@FindBy(xpath = "//*[@class='a-carousel-card']//img[@alt='Amazon fashion']")
	WebElement fitnessCarousel;
	
	@FindBy(xpath = "//*[@cel_widget_id='MAIN-SEARCH_RESULTS-2']")
	WebElement fitnessSection;
	
	@FindBy(xpath = "//*[@id='nav-link-accountList']")
	WebElement signinHover;
	
	@FindBy(xpath = "//*[@id='nav-flyout-ya-signin']//a[@class='nav-action-signin-button']")
	WebElement signInButton;
	
	@FindBy(xpath = "//*[@id='ap_email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement continueButton;
	
	@FindBy(xpath = "//*[@id='ap_password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@id='signInSubmit']")
	WebElement finalSignin;
	
	
	
	
	public HomePage(WebDriver driver)
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
	
	public boolean isCartIconDisplayed()
	{
		boolean isDisplayed = cartIcon.isDisplayed();
		
		return isDisplayed;
	}
	
	
	public void carouselNavigation()
	{
		wait.until(ExpectedConditions.visibilityOf(fitnessCarousel));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", fitnessCarousel);
		
	}
	
	
	public boolean fitnessModule()
	{
		wait.until(ExpectedConditions.visibilityOf(fitnessSection));
		
		boolean isDisp = fitnessSection.isDisplayed();
		
		return isDisp;
	}
	
	public void enterUsername(String uname)
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(signinHover).perform();
		
		signInButton.click();
		
		email.sendKeys(uname);
		
		continueButton.click();
				
	}

	public void enterPassword(String pwd)
	{
		passwordField.sendKeys(pwd);
		
		finalSignin.click();
		
		
	}
	
	
	
	
	
	

}