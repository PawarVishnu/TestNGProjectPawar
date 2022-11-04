package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import ResourceFile.baseclass;

public class VerifyLogin extends baseclass {
	
	@Test
	public void Login() throws IOException {
		
		 intializeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	
	LoginPageObjects LPO=new LoginPageObjects(driver);
	
	LPO.EnterUsername().sendKeys("vishnu");
	LPO.EnterPassword().sendKeys("1234");
	LPO.ClickOnLogin().click();
	}

}
