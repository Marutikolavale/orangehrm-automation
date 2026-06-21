package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobpage extends Basepage{

	
	public Jobpage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath ="//ul[@class='oxd-dropdown-menu']/child::li") private  List <WebElement>  Jobdropdwon;




























}
