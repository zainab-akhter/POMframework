package pages;

import wrapper.ProjectSpecificWrapper;

public class MergeLeadPage extends ProjectSpecificWrapper{
	
	public FindLeadsWinPage clickIconNearFormLead() {
		clickByXpath("(//img[@alt='Lookup'])[1]");
		switchToLastWindow();
		return new FindLeadsWinPage();
	}
	public FindLeadsWinPage ClickIconNearToLead() {
		clickByXpath("(//img[@alt='Lookup'])[2]");
		switchToLastWindow();
		return new FindLeadsWinPage();
	}
	public ViewLeadPage clickMerge() {
		clickByXpath("//a[text()='Merge']");
		acceptAlert();
		return new ViewLeadPage();
	}

}
