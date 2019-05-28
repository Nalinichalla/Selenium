package Webdriver;

import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class collegeweeklive {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.collegeweeklive.com/go-signup/go-signup2");//loading page
	//add wait statement to visible the First name element
	Thread.sleep(5000);
	driver.findElement(By.name("firstName")).sendKeys("tony");
	driver.findElement(By.name("lastName")).sendKeys("Romo");
	driver.findElement(By.name("emailAddress")).sendKeys("Test@gmail.com");
	driver.findElement(By.name("phoneNumber")).sendKeys("5425698558");
	driver.findElement(By.name("password")).sendKeys("asdf@123");
	driver.findElement(By.name("ConfirmPassword")).sendKeys("asdf@123");
//	dropdownhandle
//	Select s = new Select(driver.findElement(By.id("questions[q_17]")));	
//	s.selectByVisibleText("Female");
	
	//new Select(driver.findElement(By.id("questions[q_17]"))).selectByVisibleText("Female");
	Select countrydropdown = new Select(driver.findElement(By.id("country")));
countrydropdown.selectByVisibleText("UNITED STATES");
new Select(driver.findElement(By.id(("questions[q_17]")))).selectByVisibleText("Female");

		
		

	}

}
