package com.TMP.TestCases;

import java.io.IOException;
import org.testng.annotations.*;
import com.TMP.Pages.Login;
import com.TMP.Pages.Release;
import com.TMP.Utilities.ReusableMethods;

public class TestCase extends ReusableMethods
{	
	//TestCase : BU Approver approves Release Approval to CDP 
	@Test
	public void L1_TC_001() throws IOException, InterruptedException
	{
		Login.AppLogin();
		Release.RM();
		Release.ReleaseAssociate();
	}
	
	@BeforeTest
	public void beforeTest() throws IOException 
	{
		initialiseDriver();
		invokeApplication();
	}

	@AfterTest
	public void afterTest() 
	{
		//tearDown();
	}
}
