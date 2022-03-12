package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC005_DuplicateLead extends ProjectSpecificWrapper{
	
	@BeforeTest
	public void setData() {
		excelfile = "TC005_DuplicateLead";	
		
	}
	
	@Test (dataProvider = "getData" )
	public void duplicateLead(String uName, String pwd) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink();
	}

}
