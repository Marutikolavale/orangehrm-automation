package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Directorypage  extends Basepage{	
	public Directorypage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='Type for hints...']") 
	private WebElement Directory_EmployeeName;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div") 
	private WebElement jobTitle_dropDown;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div/parent::div")
	private WebElement Location_dropDown;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--ghost']") 
	private WebElement resetBtn;
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement  SearchBtn; 
	
	
	
	
	
	
	
	
	
	
	
}
