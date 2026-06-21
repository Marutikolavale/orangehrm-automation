package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leavepage extends Basepage{



	public Leavepage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(linkText ="Apply") private WebElement Apply;
	@FindBy(linkText ="My Leave") private WebElement My_Leave;
	@FindBy(linkText ="Entitlements ") private WebElement Entitlements ;
	@FindBy(linkText ="Reports ") private WebElement Reports ;
	@FindBy(linkText ="Configure ") private WebElement Configure ;
	@FindBy(linkText ="Leave List") private WebElement Leave_List;
	@FindBy(linkText ="Assign Leave") private WebElement Assign_Leave;

	// my Leave
	@FindBy(xpath ="//i[@ class='oxd-icon bi-x oxd-sidepanel-header-close']") private WebElement MyLeave_fromDate;
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active' and  @placeholder='Search']") private WebElement MyLeave_fromDate_Year;
	@FindBy(xpath="//div[text()='Select']") private WebElement Show_Leave_with_Status;
	@FindBy(xpath="//div[@class='oxd-multiselect-chips-area']/child::span") private List <WebElement>  show_Leave_with_Status_dropdwon;
	
	public void clickApply()
	{
		Apply.click(); 
	}
	public void clickMy_Leave()
	{
		My_Leave.click();
	}
	public void clickEntitlements()
	{
		Entitlements.click(); 
	}
	public void clickReports()
	{
		Reports.click(); 
	}
	public void clickConfigure()
	{
		Configure.click();	 
	}
	public void clickLeave_List()
	{
		Leave_List.click(); 
	}
	public void clickAssign_Leave()
	{
		Assign_Leave.click(); 
	} 
	public void A(String er)
	{
		for(WebElement  a:show_Leave_with_Status_dropdwon)
		{
			if (a.getText().equals(er)) 
			{
				a.click();
				System.out.println();
				
			}
		a.getText();	
		}
	}
}
