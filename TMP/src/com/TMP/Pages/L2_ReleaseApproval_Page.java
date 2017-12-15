package com.TMP.Pages;

import java.io.IOException;

import org.openqa.selenium.*;
import com.TMP.Utilities.ReusableMethods;


public class L2_ReleaseApproval_Page extends com.TMP.Utilities.ReusableMethods {
	
	
	public static void L2RelApp() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='cdp_search_wrapper']/div/div/div/input")).sendKeys(cellRead(1,0,1));
		driver.findElement(By.xpath("//*[@id='cdp_search_wrapper']/div/div/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("edit_cdp_table")).click(); 
		driver.findElement(By.xpath("//*[@id='cdp-manager-content-main']/div/div/dashboard-main/div[2]/release-approvals/div[5]/edit-release/div[5]/div[3]/div[2]/select")).click();
		driver.findElement(By.xpath("//*[@title='Medical leave']")).click();
		System.out.println();
	}

}
