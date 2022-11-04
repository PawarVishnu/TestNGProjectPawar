package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.SignUpPageObjects;
import ResourceFile.baseclass;

public class VerifySignup extends baseclass{
	
	@Test
	public void Login() throws IOException, InterruptedException {
		 intializeDriver();
	driver.get("https://login.salesforce.com/?locale=in");
	
	LoginPageObjects VSU=new LoginPageObjects(driver);

	VSU.ClickOnTryForFree().click();
	
	SignUpPageObjects SUPO=new SignUpPageObjects(driver);
	
	Thread.sleep(3000);
	SUPO.EnterFirstname().sendKeys("vishnu");
	SUPO.EnterLastName().sendKeys("pawar");
	SUPO.EnterWorkMail().sendKeys("pawar123@mail.com");
	SUPO.selectJobTital().click();
	SUPO.EnterCompanyName().sendKeys("Infosys");
	SUPO.SelectEmployees().click();
	SUPO.EnterUserPhone().sendKeys("8080430074");
	SUPO.SelectCountryName().click();
	SUPO.ClickOnCheckBox().click();
	
	
}

}