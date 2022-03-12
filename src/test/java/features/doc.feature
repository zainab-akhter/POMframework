Feature: Automate TestLeaf Application

@Smoke
Scenario Outline: TC001_Login and Logout 

	Given Launch chrome browser and load url 
	And enter username as <usernsme> 
	And enter password as <password>
	When click the login button 
	Then its navigated Homepage 
	And  click the logout button
	And close browser
	
	Examples:
	         |username|password|
	         |DemoSalesManager|crmsfa|
	         |DemoCSR|crmsfa|
@WIP         
Scenario:  TC002_Login and Logout for failure

	Given Launch chrome browser and load url 
	And enter username as ssssss 
	And enter password as crmsfa 
	When click the login button 
	Then its navigated to same Page
	But verify error msg
	And close browser
	
@Smoke
Scenario Outline: TC003_CreateLead

	Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click the login button
	And click CRMSFA
	And click leads link
	When click createLead	
	And enter the company as <company>
	And enter the firstname as <firstname>
	And enter the lastname as <lastname>
	And enter the phone number as digit
	And choose source as Website
	And click the create lead button
	Then its navigated ViewLeadPage 
	And verify the firstname
	And close browser
	
	Examples:
	        |company|firstname|lastname|
	        |ABC|Hema|Mali|
	        |TCS|Gopi|Nath|
	        |CTS|Lakshmi|Rai|
	        
@Functional	
Scenario: TC004_EditLead

	Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click the login button
	And click CRMSFA
	And click leads link
	When click Find Leads
	And enter firstname
	And click Find Leads button
	And click first resulting lead
	Then navigated ViewLeadPage
	And verify title of the page
	And click on Edit
	Then navigated Edit Lead page
	And change the company name
	And click update
	And confirm changed name appears
	And close browser
        
	

	

	