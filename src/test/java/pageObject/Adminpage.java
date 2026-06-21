package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage extends Basepage{
	
	 public Adminpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	 
	 @FindBy(linkText ="//span[ text()='User Management ' and @class='oxd-topbar-body-nav-tab-item']") private WebElement UserManagement;
	 @FindBy(xpath ="//span[text()='Job ']") private WebElement Job;
	 @FindBy(linkText ="Organization") private WebElement Organization;
	 @FindBy(linkText ="Qualifications") private WebElement Qualifications  ;
	 @FindBy(linkText ="Nationalities") private WebElement Nationalities;
	 @FindBy(linkText ="Corporate Branding") private WebElement CorporateBranding;
	 @FindBy(linkText ="Configuration") private WebElement Configuration;
	 //
	 @FindBy(linkText="Users") private WebElement users;
	 @FindBy(xpath ="//div[@class='oxd-select-text-input']") private WebElement SSS;
	 @FindBy(xpath ="//div[text()='Disabled' and @class='oxd-select-text-input']") private WebElement aaa;
	
	 public void clickUserManagement()
	 {
		 UserManagement.click();
	 }
	 public void clickJob()
	 {
		 Job.click();
	 }
	
	 public void clickOrganization()
	 {
		 Organization.click();
	 }
	
	 public void clickQualifications()
	 {
		 Qualifications.click();
	 }
	
	 public void clickNationalities()
	 {
		 Nationalities.click();
	 }
	
	 public void clickCorporateBranding()
	 {
		 CorporateBranding .click();
	 }
	 public void clickConfiguration()
	 {
		 Configuration.click();
	 }	
	  public void clickusers()
	  {
		  users.click();
	  }
}
