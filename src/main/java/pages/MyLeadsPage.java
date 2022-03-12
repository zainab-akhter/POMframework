package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeadsPage extends ProjectSpecificWrapper{
	
	public CreateLeadPage clickCreateLeadLink() {
		clickByLinkText("Create Lead");
		return new CreateLeadPage();
	}
	public FindLeadsPage clickFindLeads() {
		clickByLinkText("Find Leads");
		return new FindLeadsPage();
	}
	
	public MergeLeadPage clickMergeLeads() {
		 clickByXpath("//a[text()='Merge Leads']");
		 return new MergeLeadPage();
	 }

public void moveToNewWindow() {
	
}

}
