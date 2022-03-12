Feature: Automate TestLeaf Application

Scenario: TC005_DeleteLead

	Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click the login button
	And click CRMSFA
	And click leads link
	When click Find Leads
	
	And click on phone
	And enter phone number 
	And click find leads button
	And capture lead ID of first resulting lead
	And click first resulting lead
	And click Delete
	Then navigated MyLeadsPage
	And click Find Leads
	And enter captured lead ID
	
	And verify error message
	And close browser
