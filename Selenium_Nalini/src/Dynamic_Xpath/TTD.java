package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TTD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ttdsevaonline.com/#/registration");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='fName']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@name='lName']")).sendKeys("asdfd");
		driver.findElement(By.xpath("//*[@name='mobNo']")).sendKeys("7702315291");
		//DOB
		driver.findElement(By.id("regdob")).click();
		Thread.sleep(2000);
		//Selct Month
		new Select(driver.findElement(By.xpath("//*[@title='Change the month']"))).selectByVisibleText("May");
		//select Year
		new Select(driver.findElement(By.xpath("//*[@title='Change the year']"))).selectByVisibleText("2012");
		//click on Date
		driver.findElement(By.xpath("//*[contains(@title,'May 18')]")).click();
		
		driver.findElement(By.xpath("(//*[@name='gender'])[2]")).click();
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("310 ridgewood dr");
		driver.findElement(By.xpath("//*[@name='cityS']")).sendKeys("Lewisville");
		new Select(driver.findElement(By.xpath("//*[@name='countryS']"))).selectByVisibleText("India");
		new Select(driver.findElement(By.xpath("//*[@name='stateS']"))).selectByVisibleText("Andhra Pradesh");			
		driver.findElement(By.xpath("(//*[@type='text'])[7]")).sendKeys("50035");
		new Select(driver.findElement(By.xpath("//*[@name='proofS']"))).selectByVisibleText("PAN Card");
		driver.findElement(By.xpath("(//*[@type='text'])[8]")).sendKeys("AAAPL1234C");
		driver.findElement(By.xpath("//*[@name='emailId']")).sendKeys("Nalinichalla@gmail.com");
		driver.findElement(By.xpath("(//*[@type='password'])[1]")).sendKeys("May@2019");
		driver.findElement(By.xpath("//*[@name='repassword']")).sendKeys("May@2019");
		driver.findElement(By.xpath("(//*[@class='btn btn-act ng-binding'])[5]")).click();

	}

}
