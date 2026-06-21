package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buzzpage extends Basepage{
	public Buzzpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath ="//button[@type='submit']") private WebElement postButton;
	@FindBy(xpath ="//button[text()=' Share Photos']") private  WebElement sharePhoto;
	@FindBy(xpath = "//textarea[@class='oxd-buzz-post-input']") private WebElement textbox ;
	@FindBy(xpath = "//button[text()=' Share Video']") private WebElement shareVideoBtn;
	@FindBy(xpath = "//button[text()=' Most Recent Posts ']") private WebElement mostRecentPostBtn;
	@FindBy(xpath = "//button[text()=' Most Liked Posts ']") private WebElement mostLikedPostBtn;
	@FindBy(xpath = "//button[text()=' Most Commented Posts ']") private WebElement mostCommentedBtn;
	@FindBy(xpath ="//i[@class='oxd-icon bi-x oxd-sidepanel-header-close']") private WebElement ActionBTN;
}
