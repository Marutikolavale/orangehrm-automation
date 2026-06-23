package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObject.DashBordpage;
import pageObject.Loginpage;
import utilities.MyTestListener;
import utilities.ReadConfig;
@Listeners(MyTestListener.class)
public class login extends Baseclass {

	@Test
	public void Login()
	{

	}
	@Test
	public void Invaild_Login_TC02() throws EncryptedDocumentException, IOException, InterruptedException {
		try {

			Loginpage lp = new Loginpage(driver);
			ReadConfig Rc=new ReadConfig();	
			DashBordpage db = new DashBordpage(driver);		
			int rc = Rc.GetRowCount(EXCEL_PATH, "Invalidcreads");
			for (int i = 1; i <= rc; i++) {
				String User = Rc.ReadExcelData(EXCEL_PATH, "Invalidcreads", i, 0);
				String Pass = Rc.ReadExcelData(EXCEL_PATH, "Invalidcreads", i, 1);
				lp.usernameWebElement().clear();
				lp.username(User);
				System.out.println("vaibhav");
				System.out.println("Maruti");

				lp.passworedWebElement().clear();
				lp.passwored(Pass);
				lp.clickloginbutton();
			}

		} 
		catch (Exception e) {
			e.printStackTrace(); 
			throw e;
		}

	}
}
