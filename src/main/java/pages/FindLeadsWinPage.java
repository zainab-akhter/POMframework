package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsWinPage extends ProjectSpecificWrapper{
	
	public FindLeadsWinPage enterLeadId(String entLeadId) {
		enterByXpath("(//div[@class='x-form-element']/input)[1]", entLeadId);
		return this;
	}

	public FindLeadsWinPage clickFindLeadBtn() {
		clickByXpath("//button[text()='Find Leads']");
		return this;
	}

	public MergeLeadPage clickFstResLead() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		switchToParentWindow();
		return new MergeLeadPage();
	}

	public FindLeadsWinPage clickFstResLead1() {
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		return this;
	}
	public FindLeadsWinPage enterFormLeadId(String enterFormLId) {
		enterByXpath("(//div[@class='x-form-element']/input)[13]", enterFormLId);
		return this;
	}
}
