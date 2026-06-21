package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruitmentpage  extends Basepage{
	
	public Recruitmentpage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(linkText ="Candidates") private WebElement Candidates;
	@FindBy(linkText ="Vacancies") private WebElement Vacancies;


	public  void clickCandidates()
	{
		Candidates.click();
	}
	public  void clickVacancies()
	{
		Vacancies.click();
	}
}
