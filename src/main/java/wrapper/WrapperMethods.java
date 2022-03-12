package wrapper;

import java.io.IOException;

public interface WrapperMethods {
	

	/**
	 * This method will launch the given browser and maximize the browser and set the
	 * wait for 30 seconds and load the urlGeneric
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * 
	 */
	public void invokeApp(String url);

	/**
	 * This method will enter the value to the text field using id attribute to locate		 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 */
	public void enterById(String idValue, String data);
	/**
	 * This method will enter the value to the text field using id attribute to locate		 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 */
	//public void enterById(String idValue, int value); 

	/**
	 * This method will enter the value to the text field using name attribute to locate		 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the Webelement
	 */
	
	public void enterByName(String nameValue, String data);		

	/**
	 * This method will enter the value to the text field using xpath attribute to locate		 * 
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 */
	public void enterByXpath(String xpathValue, String data);
	
	/**
	 * This method will clear the value to the text field using Xpath attribute to locate		 * 
	 * @param xpathValue - name of the Webelement
	 * @param data - The data to be sent to the webelement
	 */
	//public void clearById(String xpathValue, Keys clear);
	
	/**
	 * This method will enter the value to the text field using CssSelector attribute to locate		 * 
	 * @param CssValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 */
	public void enterByCssSelector(String CssValue, String data);

	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @return 
	 */
	public boolean verifyTitle(String title);

	/**
	 * This method will verify the given text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 */
	public void verifyTextById(String id, String text);

	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 */
	public void verifyTextByXpath(String xpath, String text);
	
	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 */
	public void verifyTextContainsByXpath(String xpath, String text);
	
	public void verifyErrorMessage(String xpathValue);

	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 */
	public void verifyTextContainsById(String id, String text);

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 */
	public void clickById(String id);

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 */
	public void clickByClassName(String classVal);

	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 */
	public void clickByName(String name);

	/**
	 * This method will click the element using link name as locator
	 * @param name  The link name (locator) of the element to be clicked
	 */
	public void clickByLinkText(String text);

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 */
	public void clickByXpath(String xpathVal);
	
	/**
	 * This method will click the element using cssSelector as locator
	 * @param cssSelector  The cssSelector (locator) of the element to be clicked
	 */
	public void clickByCssSelector(String CssValue, String value);

	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 */
	public String getTextById(String idVal);

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 */
	public String getTextByXpath(String xpathVal);

	/**
	 * This method will select the drop down visible text using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 */
	public void selectVisibileTextById(String id, String value);
	
	/**
	 * This method will select the drop down visible text using name as locator
	 * @param name The name (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 */
	public void selectByVisibleTextByName(String name, String value);

	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 */
	public void selectIndexById(String id, int value);
	
	/**
	 * This method will select the drop down using index as name locator
	 * @param name The name (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 */
	
	public void selectIndexByName(String name, int Value);

	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param id The id to be selected (value) from the dropdown 
	 */
	public void selectByValueById(String id, String value);
	
	/**
	 * This method will select the drop down using index as name locator
	 * @param name The name (locator) of the drop down element
	 * @param name The name to be selected (value) from the dropdown 
	 */
	public void selectByValueByName(String name, String value);
	
	/**
	 * This method will switch to the parent Window
	 */
	public void switchToParentWindow();

	/**
	 * This method will move the control to the last window
	 */
	public void switchToLastWindow();

	/**
	 * This method will accept the alert opened
	 */
	public void acceptAlert();
	
	/**
	 * This method will reject/dismiss the alert opened
	 */
	public void dismissAlert();
	/**
	 * 
	 * This method will take a snapshot of the particular page
	 */
	//public void takesnap() throws IOException;
	
	//public void explecitWait() throws InterruptedException;

	/**
	 * This method will close all the browsers
	 */
	public void quitBrowser();
	/**
	 * This method will close the current active browser
	 */
	public void closeBrowser();
	

}
