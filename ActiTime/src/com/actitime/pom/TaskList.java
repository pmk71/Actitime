package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewButton;

@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomer;

@FindBy(xpath="//input[@placeholder='Enter Customer Name'and @class]")
private WebElement enterCustomerNameTbx;

@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement enterCustomerDescriptiontbx;

@FindBy(xpath="//span[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer']")
private WebElement selectCustomer;

@FindBy(xpath="//div[text()='Big Bang Company'and @class='itemRow cpItemRow ']")
private WebElement bigBangCompany;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustomer;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
private WebElement actualCustomerName;

@FindBy(xpath="//input[@placeholder='Start typing name ...']")
private WebElement customerProductSearchbox;

@FindBy(xpath="//span[@class='highlightToken']")
private WebElement firstCustemerinserachBox;

@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='editButton']")
private WebElement editcustomerOrProject;

@FindBy(xpath="//div[text()='ACTIONS']")
private WebElement actionsButton;

@FindBy(xpath = "//div[text()='Delete'and @class='title']")
private WebElement deleteButton;

public TaskList(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getAddNewButton() {
	return addNewButton;
}

public WebElement getNewCustomer() {
	return newCustomer;
}

public WebElement getEnterCustomerNameTbx() {
	return enterCustomerNameTbx;
}

public WebElement getEnterCustomerDescriptiontbx() {
	return enterCustomerDescriptiontbx;
}

public WebElement getSelectCustomer() {
	return selectCustomer;
}

public WebElement getBigBangCompany() {
	return bigBangCompany;
}

public WebElement getCreateCustomer() {
	return createCustomer;
}

public WebElement getActualCustomerName() {
	return actualCustomerName;
	
}

public WebElement getCustomerProductSearchbox() {
	return customerProductSearchbox;
}

public WebElement getFirstCustemerinserachBox() {
	return firstCustemerinserachBox;
}

public WebElement getEditcustomerOrProject() {
	return editcustomerOrProject;
}

public WebElement getActionsButton() {
	return actionsButton;
}

public WebElement getDeleteButton() {
	return deleteButton;
}


}





