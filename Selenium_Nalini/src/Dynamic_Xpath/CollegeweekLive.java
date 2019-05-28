package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollegeweekLive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/go-signup/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@type='text'][@name='firstName']")).sendKeys("Nalini");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("challa");
		driver.findElement(By.xpath("//*[@name='emailAddress']")).sendKeys("Nalini.challa@gmail.com");
		driver.findElement(By.xpath("//*[@type='text'][@id='phoneNumber']")).sendKeys("4694643667");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//*[@type='password' and @name = 'ConfirmPassword']")).sendKeys("test@123");
        driver.findElement(By.xpath("//*[@id='country']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='register']/div[4]/div[2]/div/div/select/option[4]")).click();
		driver.findElement(By.xpath("//*[@id='questions[q_134]']/option[2]")).click();
		driver.findElement(By.xpath("//*[@id='questions_16_Month']/option[5]")).click();
		driver.findElement(By.xpath("//*[@id='questions_16_DayOfMonth']/option[30]")).click();
		driver.findElement(By.xpath("//*[@id='questions_16_DOBYear']/option[5]")).click();
		driver.findElement(By.xpath("//*[@class ='submit btn btn-social default-blue']")).click();
		
		

	}

}
