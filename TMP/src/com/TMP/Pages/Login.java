package com.TMP.Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.TMP.Utilities.ReusableMethods;

public class Login extends ReusableMethods
{
	public static void AppLogin() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//*[@id='test-info-wrapper']/span")).click();
		driver.findElement(By.xpath("//*[@id='username']")).clear();
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys(cellRead(0,1,1));
	}
}
