package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shearcircle_onlineregistration {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Nalini\\Browser drivers\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.shearcircle.com/customer/register");
		Driver.findElement(By.id("firstname")).sendKeys("Charlie");
		Driver.findElement(By.id("lastname")).sendKeys("meghal");
		Driver.findElement(By.id("uname")).sendKeys("nalini123@yopmail.com");
		new Select(Driver.findElement(By.id("isd_code"))).selectByVisibleText("US (+1)");
		Driver.findElement(By.id("mobile")).sendKeys("9875641230");
		Driver.findElement(By.id("password")).sendKeys("123456");
		Driver.findElement(By.id("cnf_password")).sendKeys("123456");
		Thread.sleep(3000);
		Driver.findElement(By.name("has_agreed")).click();
		Driver.findElement(By.name("accepted_billing_agreement")).click();
		

	}
}
