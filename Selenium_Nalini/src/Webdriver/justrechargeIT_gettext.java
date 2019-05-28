package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justrechargeIT_gettext {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Workspace\\Selenium_Automation\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.name("txtUserName")).sendKeys("cnu4mca@gmail.com");
		driver.findElement(By.name("txtPasswd")).sendKeys("123456");;
		driver.findElement(By.id("imgbtnSignin")).click();
		String text = driver.findElement(By.id("jriTop_lblUserMsg")).getText();
		System.out.println(text);
		System.out.println("welcome");
		//click on SignOut link
		driver.findElement(By.id("jriTop_signOut")).click();
		//to close the current browser
		driver.close();
		
		
	}

}
