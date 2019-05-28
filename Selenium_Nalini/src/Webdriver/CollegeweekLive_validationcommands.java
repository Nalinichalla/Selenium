package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeweekLive_validationcommands {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/go-signup/go-signup2");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Student Looking for Graduate Degree");
		Thread.sleep(3000);
		// Date of birth element has present or not?
		boolean abcd = driver.findElement(By.id("questions_16_Month")).isDisplayed();
		if (abcd) {
			System.out.println("DOB has displayed on the page");
		} else {
			System.out.println("DOB has not displayed on the page");
		}
		
		new Select(driver.findElement(By.name("attendeeType"))).selectByVisibleText("Parent");
		boolean xyz = driver.findElement(By.id("questions_16_Month")).isDisplayed();
		if (xyz) {
			System.out.println("DOB has displayed on the page****");
		} else {
			System.out.println("DOB has not displayed on the page***");
		}
		
	}
}
