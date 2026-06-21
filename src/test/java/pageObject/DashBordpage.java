package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBordpage extends Basepage {	
	public DashBordpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="//input[@class='oxd-input oxd-input--active']") private WebElement Search;
	@FindBy(linkText = "Admin") private  WebElement Admin;
	@FindBy(linkText = "PIM") private  WebElement PIM;
	@FindBy(linkText = "Leave") private  WebElement Leave;
	@FindBy(linkText = "Time") private  WebElement Time;
	@FindBy(linkText = "Recruitment") private  WebElement Recruitment;
	@FindBy(linkText = "My Info") private  WebElement MyInfo;
	@FindBy(linkText = "Performance") private  WebElement Performance;
	@FindBy(linkText = "Dashboard") private  WebElement Dashboard;
	@FindBy(linkText = "Directory") private  WebElement Directory;

	@FindBy(linkText = "Maintenance") private  WebElement Maintenance;
	@FindBy(linkText ="Claim") private WebElement Claim;
	@FindBy(linkText = "Buzz") private  WebElement Buzz;
	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement Dashboard_logo;
	public void   Searchclick()
	{
		Search.click();
	}
	public void  adminclick()
	{
		Admin.click();
	}
	public void   PIMclick()
	{
		PIM.click();
	}
	public void  Leaveclick()
	{
		Leave.click();
	}
	public void   Timeclick()
	{
		Time.click();
	}
	public void  Recruitmentclick()
	{
		Recruitment.click();
	}
	public void  MyInfoclick()
	{
		MyInfo.click();
	}
	public void   Performanceclick()
	{
		Performance.click();
	}
	public void   Dashboardclick()
	{
		Dashboard.click();
	}
	public void   Directoryclick()
	{
		Directory.click();
	}
	public void   Maintenanceclick()
	{
		Maintenance.click();
	}
	public void  Buzzclick()
	{
		Buzz.click();
	}
	public Boolean  dashboard_logo_Displayed()
	{
		return Dashboard_logo.isDisplayed();
	}
}
