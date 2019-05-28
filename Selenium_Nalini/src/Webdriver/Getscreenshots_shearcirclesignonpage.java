package Webdriver;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Getscreenshots_shearcirclesignonpage {
	static WebDriver driver;
	
	public static void TakeScreenshot() throws IOException {
		Date d = new Date();
		System.out.println(d);//Mon Apr 08 21:39:40 CDT 2019
		
		//create our own format dd_MM_yyyy_HH_mm_ss
		DateFormat df = new  SimpleDateFormat("yyyy_MMM_dd_HH_mm_ss");//08_Apr_2019_21_44_19
		String timeStamp = df.format(d);
		System.out.println(timeStamp);
		
		String screenshotpath = "F:\\Selenium\\Workspace\\Selenium_Nalini\\Screenshots\\";
		File asdf = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(asdf, new File(screenshotpath + "ShearCircle" + timeStamp+".png"));

	}

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Nalini\\Browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://shearcircle.com/login");
		Thread.sleep(3000);
		TakeScreenshot();
		driver.findElement(By.id("username")).sendKeys("Charlie");
		TakeScreenshot();
//			File scrFile = ((TakesScreenshot) Driver).getScreenshotAs(OutputType.FILE);
//			FileHandler.copy(scrFile, new File(screenshotPath + name +timeStamp+".png"));

	}

}
