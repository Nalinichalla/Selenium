package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Justrechargeit_Alerthandle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Selenium\\Workspace\\Selenium_Nalini\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("cnu4mca@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		driver.findElement(By.id("imgbtnSignin")).click();
		Thread.sleep(3000);
		// click on Delete icon
		driver.findElement(By.id("listingtable_btnGridDelete_6")).click();
		Thread.sleep(3000);
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		// driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();

		driver.quit();

	}

}
