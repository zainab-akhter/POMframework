package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC004_DeleteLead extends ProjectSpecificWrapper {
	@BeforeTest
	public void setData() {
		excelfile = "TC004_DeleteLead";	
		
	}
	
	@Test (dataProvider = "getData" )
	public void deleteLead(String uName, String pwd, String Ph, String CapID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickFindLeads()
		.clickOnPhone();
		/*//.enterPhoneNumber(Ph)
		.clickFindLeadsBtn()
		.captureLeadIdOfFstResLead()
		.clickFstResLead2()
		.clickDelete()
		.clickFindLeads()
		.enterCapturedLeadId(CapID)
		.clickFindLeadsBtn()
		.verifyErrorMsg();*/
		
		
	}

}
