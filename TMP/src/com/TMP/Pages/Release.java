package com.TMP.Pages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.TMP.Utilities.ReusableMethods;

public class Release extends ReusableMethods
{
	public static   WebDriverWait wait; 
	public static void RM()
	{
		driver.findElement(By.xpath("//*[@id='btn-append-to-body']")).click();
		driver.findElement(By.linkText("Releasing Manager")).click();
	}
	public static void ReleaseAssociate() throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver,15);
		
		
		driver.findElement(By.id("release-request-id")).sendKeys(cellRead(0,4,1));
		driver.findElement(By.xpath("//*[@id='search-wrapper']/input[3]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader ng-scope")));
		
		
		
		driver.findElement(By.cssSelector("#release-requestform > div:nth-child(1) > div.releaseprojectinfo.col-sm-9 > table > tbody > tr:nth-child(1) > td:nth-child(1) > span > label")).click();
		driver.findElement(By.xpath("//*[@id='release-reason']")).click();
		driver.findElement(By.linkText(cellRead(0,4,2))).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader ng-scope"))); 
		driver.findElement(By.xpath("//*[@id='projduration']/input")).sendKeys(cellRead(0,4,3));
		driver.findElement(By.xpath("//*[@id='appraisal-technical-skills']")).click();
		driver.findElement(By.linkText(cellRead(0,4,4))).click();
		driver.findElement(By.xpath("//*[@id='appraisal-pjt-skills']")).click();
		driver.findElement(By.linkText(cellRead(0,4,4))).click();
		driver.findElement(By.xpath("//*[@id='appraisal-domain-skills']")).click();
		driver.findElement(By.linkText(cellRead(0,4,4))).click();
		driver.findElement(By.xpath("//*[@id='appraisal-comm-skills']")).click();
		driver.findElement(By.linkText(cellRead(0,4,4))).click();
		driver.findElement(By.xpath("//*[@id='release-requestform']/div[3]/div/div[2]/div/textarea")).sendKeys(cellRead(0,4,5));
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('date-of-release').removeAttribute('readonly')");
		driver.findElement(By.id("date-of-release")).clear();
		driver.findElement(By.id("date-of-release")).sendKeys("15/12/2017");
		/*driver.findElement(By.id("date-of-release")).click();		
		List<WebElement> allDates=driver.findElements(By.xpath("ui-datepicker-calendar"));
		for(WebElement ele:allDates)
		{
			String date=ele.getText();
			if(date.equalsIgnoreCase("28"))
			{
				ele.click();
				break;
			}
		}*/
		
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("progressbar"))); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='release-request-wrapper']/div/footer/div/button[1]")));
		System.out.println("after porgressbar");
//		driver.findElement(By.cssSelector("#release-request-wrapper > div > footer > div > butto'.btn.green-btn")).click();
		if(driver.findElement(By.xpath("//*[@id='release-request-wrapper']/div/footer/div/button[1]")).isEnabled())
		driver.findElement(By.xpath("//*[@id='release-request-wrapper']/div/footer/div/button[1]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader ng-scope")));
	}
}
