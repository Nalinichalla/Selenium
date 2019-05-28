package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ncalculators.com/interest/monthly-interest-calculator.htm");
		// to maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		new Select(driver.findElement(By.id("from_cur"))).selectByValue("INR");
		Thread.sleep(3000);
		// defalut text/data should be clear before sendkeys
		driver.findElement(By.id("amount")).clear();
		driver.findElement(By.id("amount")).sendKeys("500000");
		driver.findElement(By.id("days")).clear();
		driver.findElement(By.id("days")).sendKeys("12");
		driver.findElement(By.id("interest")).clear();
		driver.findElement(By.id("interest")).sendKeys("12");

		// Page scroll down or scroll to specific element
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2500)");

		// Click on compound radio button
		driver.findElement(By.xpath("(//*[@id='type'])[2]")).click();
		// click on Submit button
		driver.findElement(By.id("button")).click();
		Thread.sleep(3000);

		
		String TotalInterestCost = driver.findElement(By.id("result1")).getAttribute("value");
		System.out.println("TotalInterestCost: " + TotalInterestCost);
		
//		// Get the results from elements
//		// To enable Last Name text box
//		// To enable Last Name text box
//		String toenable = "document.getElementsByName('result1')[0].removeAttribute('disabled');";
//		jse.executeScript(toenable);
//		Thread.sleep(3000);
//
//		String TotalInterestCost = driver.findElement(By.id("result1")).getText();
//		System.out.println("TotalInterestCost: " + TotalInterestCost);
//
//		String toenable1 = "document.getElementsByName('result2')[0].removeAttribute('disabled');";
//		jse.executeScript(toenable1);
//		Thread.sleep(3000);
//
//		String TotalRepayment = driver.findElement(By.id("result2")).getText();
//		System.out.println("TotalRepayment: " + TotalRepayment);

	}

}
