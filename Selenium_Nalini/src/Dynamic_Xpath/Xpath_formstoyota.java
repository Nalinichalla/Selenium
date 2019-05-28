package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class Xpath_formstoyota {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Workspace\\Selenium_Nalini\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		Thread.sleep(3000);
		
//		Dropdown
		
		driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[3]/div/div/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/section/div/div[1]/div/form/div[7]/div[1]/div[3]/div/div/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[4]/div/input")).sendKeys("firstname");
		driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[5]/div/input")).sendKeys("surname");
		driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[6]/div/input")).sendKeys("email");
		driver.findElement(By.xpath("//*[@id='submit-br']")).click();
		
		

		
				
				
				
				

	}

}
