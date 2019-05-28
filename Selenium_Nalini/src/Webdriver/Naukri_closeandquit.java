package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_closeandquit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"F:\\Selenium\\Workspace\\Selenium_Nalini\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();
		driver.quit();
		

	}

}
