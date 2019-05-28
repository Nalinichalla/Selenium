package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class crossbrowsertesting1 {
	// Global declaration
	WebDriver driver;

	@Test
	public void f() {
		driver.findElement(By.name("txtUserName")).sendKeys("teastEWsdsdg@dfgf.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("asdf123");
		driver.findElement(By.id("imgbtnSignin")).click();
	}

	@BeforeClass
	public void beforeClass() {
		// Local declaraion
		// WebDriver driver;
		System.setProperty("webdriver.gecko.driver", ".\\Browser drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
