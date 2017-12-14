package com.TMP.Pages;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import com.TMP.Utilities.ReusableMethods;

public class Login extends ReusableMethods
{
	public static void AppLogin() throws IOException, InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('test-info-wrapper').setAttribute('class', 'hide')");
		js.executeScript("document.getElementById('login-wrapper').setAttribute('class', 'enable')"); 
		driver.findElement(By.xpath("//*[@id='username']")).clear();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(cellRead(0,1,1));
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(cellRead(0,1,2));
		driver.findElement(By.xpath("//*[@id='login-btn']")).click();
	}
}
