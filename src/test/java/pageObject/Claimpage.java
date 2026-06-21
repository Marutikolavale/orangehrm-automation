package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Claimpage extends Basepage{

	public Claimpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="//a[text()='Submit Claim']") private WebElement Submit_Claim;
	@FindBy(linkText = "My Claims") private WebElement My_Claims;
	@FindBy(linkText = "Employee Claims") private WebElement Employee_Claims;
	@FindBy(linkText ="Assign Claim") private WebElement Assign_Claim;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[1]") private  WebElement Event;
	@FindBy(xpath ="(//div[@class='oxd-select-text-input'])[2]") private WebElement Currency;
	@FindBy(linkText ="//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']") private WebElement Remarks;
	@FindBy(xpath ="(//button[@type='button'])[3]") private WebElement  CancelBTN;
	@FindBy(xpath ="(//button[@type='button'])[4]") private WebElement  SaveBTN;


	@FindBy(xpath ="//label[text()='Event']/../following-sibling::div//div[@class='oxd-select-text-input']") private  List<WebElement> eventList;
	@FindBy(xpath ="//label[text()='Currency']/../following-sibling::div//div") private List<WebElement> currencyList;

	public void Select_EventList(String EventList) throws InterruptedException
	{
		for (WebElement a :eventList) {
			System.out.println(a);
			if(a.equals(EventList))
			{
				Thread.sleep(5000);
			String s = a.getText();
			System.out.println(s);
				a.click();
				
			}	
		}	

	}
	public  void select_Currency(String Currency)
	{
		for (WebElement b : currencyList) {
			if(b.equals(Currency))
			{
				b.click();
			}
		}
	}


}
