package com.TMP.iFacilitate.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import com.TMP.Pages.L2_ReleaseApproval_Page;
import com.TMP.Pages.Login;
import com.TMP.Utilities.ReusableMethods;


public class L2TestCases extends ReusableMethods
{	

	
	@BeforeTest
	public void beforeTest() throws IOException
	{
		initialiseDriver();
		invokeApplication();
			    
	}
   @Test 
	public void selectRole() throws Exception, InterruptedException
	{
	   Login.AppLogin();
	   /*ReleaseAssociate.RApage();*/
	   L2_ReleaseApproval_Page.L2RelApp();
	   /*ReleaseApproval.L2RelApp();
	   
		WebElement mySelectRole = driver.findElement(By.id("btn-append-to-body"));
		Select mySelectRole1= new Select((WebElement) mySelectRole);
		mySelectRole1.selectByVisibleText("Releasing Manager");
		mySelectRole1.selectByIndex(2);
	
}
	
	/*@AfterTest
	public void afterTest() 
	{
		tearDown();
	}*/
}


}

