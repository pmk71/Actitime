package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class ITestListenerImplementation extends BaseClass implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) {
	 String stamp = LocalDateTime.now().toString().replace(':', '-');
		 String m = result.getName();
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des= new File("./screenshot/"+m+stamp+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
		
		}
	}

}
