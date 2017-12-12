package com.TMP.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//Class that contains reusable methods
public class ReusableMethods 
{
	protected static WebDriver driver;
	static File file;
	static FileInputStream fis;
	static Properties Prop= new Properties();
	static XSSFWorkbook wb;
	static XSSFSheet sh;

	//Method to load configuration file (contains application URL, browser settings etc)
	public void propLoad() throws IOException
	{
		file = new File("C:\\Users\\549781\\Desktop\\Automation TMP\\TMP\\configuration.properties");
		fis = new FileInputStream(file);
		Prop.load(fis);
		fis.close();	
	}

	//Method to set driver for browser compatibility testing
	public void initialiseDriver() throws IOException
	{
		propLoad();
		switch(Prop.getProperty("Browser"))
		{
			case "Chrome" : System.setProperty("webdriver.chrome.driver", Prop.getProperty("ChromeDriverPath"));
							ChromeOptions o = new ChromeOptions();
							o.addArguments("disable-extensions");
							o.addArguments("--start-maximized");
							driver = new ChromeDriver(o); 
							break;
					   
			case "IE" : System.setProperty("webdriver.ie.driver", Prop.getProperty("IEDriverPath"));
							driver= new InternetExplorerDriver();
							break;
		
			case "Firefox" : driver= new FirefoxDriver();
							break;
		}
	}

	//Method to invoke URL of application
	public void invokeApplication()
	{
		driver.get(Prop.getProperty("ApplicationURL"));
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}

	//Method to read data from excel
	public static String cellRead(int sheet,int row,int column) throws IOException, InterruptedException
	{
		Thread.sleep(5000);
		file = new File("D:\\data.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sh= wb.getSheetAt(sheet);
		String data = sh.getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	/*/Method to take screenshot
	public static void Screenshot() throws IOException
	{
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		long timestamp = System.currentTimeMillis();
		FileUtils.copyFile(srcfile,new File("C:\\Users\\549781\\Desktop\\Automation TMP\\TMP\\Screenshot\\Img"+timestamp+".png"));
	}*/

	//Method to close window
	public void tearDown()
	{
		driver.close();
	}
}
