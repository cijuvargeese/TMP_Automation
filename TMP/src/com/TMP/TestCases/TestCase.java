package com.TMP.TestCases;

import java.io.IOException;
import org.junit.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.TMP.Pages.Login;
import com.TMP.Utilities.ReusableMethods;

public class TestCase extends ReusableMethods
{	
	@BeforeTest
	public void beforeTest() throws IOException 
	{
		initialiseDriver();
		invokeApplication();
	}

	@AfterTest
	public void afterTest() 
	{
		tearDown();
	}
	
	//TestCase 11 : BU Approver approves Release Approval to CDP 
	@Test
	public void L1ReleaseApprovalCDP() throws IOException, InterruptedException
	{
		Login.AppLogin();
	}
}
