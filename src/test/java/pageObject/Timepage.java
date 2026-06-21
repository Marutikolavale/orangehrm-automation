package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Timepage extends Basepage {
	
	public Timepage(WebDriver driver) {
		super(driver);		
	}
	@FindBy(linkText ="Timesheets ") private WebElement Timesheets ;
	@FindBy(linkText ="Attendance  ") private WebElement Attendance  ;
	@FindBy(linkText ="Reports  ") private WebElement Reports  ;
	@FindBy(linkText ="Project Info  ") private WebElement Project_Info  ;

	//

	public void clickTimesheets()
	{
		Timesheets.click();
	}
	public void clickAttendance()
	{
		Attendance .click();
	}
	public void clickReports()
	{
		Reports.click();
	}
	public void clickProject_Info()
	{
		Project_Info.click();
	}
}
