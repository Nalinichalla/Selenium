package Webdriver;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class justrechargeITaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignUp.aspx");
		driver.findElement(By.name("signup_name")).sendKeys("Pawan");
		driver.findElement(By.name("signup_mobileno")).sendKeys("4694643667");
		driver.findElement(By.name("signup_email")).sendKeys("Sample@gmail.com");
		driver.findElement(By.name("signup_password")).sendKeys("1234");
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox")).click();
		
		driver.findElement(By.name("imgbtnSubmit")).sendKeys("asdf");		
		
		

	}

}
