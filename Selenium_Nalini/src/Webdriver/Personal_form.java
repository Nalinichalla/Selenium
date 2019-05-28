package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.CloseWindow;
import org.openqa.selenium.support.ui.Select;

public class Personal_form {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://C:/Users/Nalini/Downloads/NSR_Selenium%20Automation.html");
		driver.findElement(By.name("firstname")).sendKeys("Tina");
		driver.findElement(By.name("lastname")).sendKeys("Moore");
		driver.findElement(By.id("sex-1")).click();
		driver.findElement(By.id("exp-4")).click();
		driver.findElement(By.id("datepicker")).sendKeys("3/31/2019");
		driver.findElement(By.id("profession-0")).click();
		driver.findElement(By.id("tool-0")).click();
		new Select(driver.findElement(By.id("continents"))).selectByVisibleText("North America");
		new Select(driver.findElement(By.id("countries"))).selectByVisibleText("U.S.A");
		new Select(driver.findElement(By.id("CurrentlyWorking"))).selectByVisibleText("NO");
		// new
		// Select(driver.findElement(By.id("CurrentlyWorking"))).selectByVisibleText("Nil");
		new Select(driver.findElement(By.xpath("(//*[@id='CurrentlyWorking'])[2]"))).selectByVisibleText("Nil");

		// new
		// Select(driver.findElement(By.id("selenium_commands"))).selectByVisibleText("WebElement
		// Commands");
		driver.findElement(By.xpath("//*[@id='selenium_commands']/option[5]")).click();

		driver.findElement(By.id("submit")).click();

		Thread.sleep(5000);

		driver.close();

	}

}
