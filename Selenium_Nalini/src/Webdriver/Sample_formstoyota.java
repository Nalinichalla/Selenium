package Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample_formstoyota {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Workspace\\Selenium_Nalini\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://forms.toyota.co.uk/brochure");
		driver.manage().window().maximize();
		driver.findElement(By.id("tgbgdpr-overlay-accept")).click();
//		driver.findElement(By.name("inner10")).click();
		driver.findElement(By.xpath("//*[@id='car_models']/div/ul/li[2]/div/img")).click();

		driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[3]/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[3]/div/div/ul/li[3]/a")).click();
		driver.findElement(By.name("firstname")).sendKeys("asdf");
		driver.findElement(By.name("surname")).sendKeys("zxcvbg");
		driver.findElement(By.id("submit-br")).click();
		Thread.sleep(5000);
		// get the email validation message and print it
		String emailText = driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[6]/div/p[2]")).getText();
		System.out.println("emailText is :   " + emailText);

	}

}
