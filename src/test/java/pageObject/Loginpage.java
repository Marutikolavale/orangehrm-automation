package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Basepage {
	public Loginpage(WebDriver driver) {
		super(driver);
	}
	
	// locate Element
	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwored;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotpasswordElement;
	@FindBy(xpath = "//p[text()='Invalid credentials']")
	private WebElement Error_message;

	public void clickForgotyourpassword() {
		forgotpasswordElement.click();
	}

	public void username(String Username) {
		username.sendKeys(Username);
		
	}
		public WebElement usernameWebElement() {
		return username;

	}
	public void passwored(String Passwored) {
		passwored.sendKeys(Passwored);
	}
	
	public WebElement passworedWebElement() {
		return passwored;
	}

	 public void clickloginbutton() {
		 loginbutton.click();
	 }
	 
	/*
	 * public void LoginOperation() throws InterruptedException,
	 * EncryptedDocumentException, IOException { String user =
	 * Rc.ReadExcelData(EXCEL_PATH, "Validcreads", 1, 0); String pass =
	 * Rc.ReadExcelData(EXCEL_PATH, "Validcreads", 1, 1); username.sendKeys(user);
	 * passwored.sendKeys(pass); loginbutton.click(); //
	 * log.info("user login sucessfull"); }
	 */

	// invalid Condition
	public void multipelLogin(String Username, String password) throws InterruptedException {
		username.sendKeys(Username);
		passwored.sendKeys(password);
		loginbutton.click();
	}
}
