package testCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import pageObject.Buzzpage;
import pageObject.DashBordpage;
import pageObject.Loginpage;

public class Buzz  extends Baseclass{

	//@Test
		public void Shearpost() throws EncryptedDocumentException, InterruptedException, IOException {

			Loginpage lp = new Loginpage(driver);
			
			DashBordpage db = new DashBordpage(driver);
			db.Buzzclick();

			Buzzpage b = new Buzzpage(driver);
			
			
		}

		@Test
		public void View_Most_Liked_Post() throws EncryptedDocumentException, InterruptedException, IOException {
			Loginpage lP = new Loginpage(driver);
	
		
			DashBordpage db = new DashBordpage(driver);
			db.Buzzclick();
			Buzzpage b = new Buzzpage(driver);

		}

	}


