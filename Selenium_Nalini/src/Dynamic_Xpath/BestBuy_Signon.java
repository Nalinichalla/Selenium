package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuy_Signon {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("(//*[@aria-label='Close'])[1]")).click();
		
		driver.findElement(By.xpath("(//*[contains(@id,'accountMenu')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Create Account']")).click();
		driver.findElement(By.xpath("//*[@id='fld-firstName']")).sendKeys("test");	
		driver.findElement(By.xpath("//*[contains(@id,'-lastName')]")).sendKeys("zxcv");
		

	}

}
