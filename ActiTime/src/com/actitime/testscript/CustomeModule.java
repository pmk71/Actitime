package com.actitime.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ITestListenerImplementation.class)
public class CustomeModule extends BaseClass {

	@Test
	public void testCreateCustomer() throws InterruptedException
	{

		EnterTimeTrack ett= new EnterTimeTrack(driver);
		ett.getTasksTab().click();
		TaskList ts= new TaskList(driver);
		ts.getAddNewButton().click();
		ts.getNewCustomer().click();
		String projectname = "HDFC_04";
		ts.getEnterCustomerNameTbx().sendKeys(projectname);
		ts.getEnterCustomerDescriptiontbx().sendKeys("Bank Project");
		ts.getCreateCustomer().click();
		WebElement ele = driver.findElement(By.xpath("//div[@class='titleEditButtonContainer']/div[text()='"+projectname+"']"));
		
	///Thread.sleep(5000);
	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(ele));
		String atext = ts.getActualCustomerName().getText();
	
	Assert.assertEquals(atext,"HDFC_06");
		Assert.assertTrue(ele.isDisplayed(),"element is not displayed");

	}

	public void testDreateCustomer() throws InterruptedException
	{
		EnterTimeTrack ett= new EnterTimeTrack(driver);
		ett.getTasksTab().click();
		TaskList ts= new TaskList(driver);
		ts.getCustomerProductSearchbox().sendKeys("hdfc"+Keys.ENTER);
		ts.getFirstCustemerinserachBox().click();
		ts.getEditcustomerOrProject().click();
		
		
		
	}
}
