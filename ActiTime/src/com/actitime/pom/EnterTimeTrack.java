package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack {
	@FindBy(id="logoutLink")
	private WebElement logoutButton;

	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasksTab;


	public EnterTimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	public WebElement getTasksTab() {
		return tasksTab;
	}
}




