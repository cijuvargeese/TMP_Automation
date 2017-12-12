package com.TMP.Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import com.TMP.Utilities.ReusableMethods;

public class Release extends ReusableMethods
{
	public static void ReleaseAssociate() throws IOException, InterruptedException
	{
		driver.findElement(By.id("release-request-id")).sendKeys(cellRead(0,1,1));
		driver.findElement(By.id("search-wrapper")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='release-requestform']/div[1]/div[3]/table/tbody/tr/td[1]/span/label")).click();
		Select ReleaseReason = new Select(driver.findElement(By.xpath("//*[@id='release-reason']")));
		ReleaseReason.selectByVisibleText(cellRead(0,1,2));
		driver.findElement(By.xpath("//*[@id='projduration']/input")).sendKeys(cellRead(0,1,3));
		
	}
}
