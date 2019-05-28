package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumeasy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("Nalini");
		driver.findElement(By.xpath("//*[@class='btn btn-default']")).click();
		Thread.sleep(3000);
//		start-with xpath
		String text = driver.findElement(By.xpath("(//*[starts-with(@id,'disp')])[1]")).getText();
		System.out.println(text);
		//one of two unique values
		String text1 = driver.findElement(By.xpath("(//*[@id='user-message'])[2]/span")).getText();
	    System.out.println(text1);
		
		String text2 = driver.findElement(By.xpath("//*[@id='display']")).getText();
		System.out.println(text2);
    

		
		

	}

}
