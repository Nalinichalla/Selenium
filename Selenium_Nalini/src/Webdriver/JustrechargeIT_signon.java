package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustrechargeIT_signon {

	public static void main(String[] args) {
		// Create Webdriver object
		WebDriver driver;
		// string path= "F:\\Selenium\Workspace\\Selenium_Nalini\\Browser
		// drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Nalini\\Browser drivers\\chromedriver.exe");
		// to launch the chrome browser
		driver = new ChromeDriver();
		// Type URL
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
		driver.findElement(By.name("txtUserName")).sendKeys("teastEWsdsdg@dfgf.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("asdf123");
		driver.findElement(By.id("imgbtnSignin")).click();

	}

}
