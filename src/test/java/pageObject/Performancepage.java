package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Performancepage extends Basepage{	
	public Performancepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//
	@FindBy(linkText ="Configure ") private WebElement Configure;
	@FindBy(linkText ="Manage Reviews  ") private WebElement Manage_Reviews;
	@FindBy(linkText ="My Trackers") private WebElement My_Trackers;
	@FindBy(linkText ="Employee Trackers ") private WebElement Employee_Trackers;

	public void clickConfigure()
	{
		Configure.click();
	}
	public void clickManage_Reviews()
	{
		Manage_Reviews.click();
	}
	public void clickMy_Trackers()
	{
		My_Trackers.click();
	}
	public void clickEmployee_Trackers()
	{
		Employee_Trackers.click();
	}
}
