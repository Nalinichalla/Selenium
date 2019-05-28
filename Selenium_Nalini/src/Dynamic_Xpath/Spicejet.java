package Dynamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		
		//driver.findElement(By.className("//*[@id='divpaxinfo']")).clear();
		//click on Passengers element
		driver.findElement(By.xpath("//*[@id='divpaxinfo']")).click();
		Thread.sleep(3000);
		//click on '+' icon on Adult
		driver.findElement(By.xpath("//*[@id='hrefIncAdt']")).click();
        Thread.sleep(3000);
		//to click on child '+' icon
		driver.findElement(By.id("hrefIncChd")).click();
		
		//Clikcj on done
		driver.findElement(By.id("btnclosepaxoption")).click();
//		selectthe currency as USD
		new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"))).selectByVisibleText("USD");
		
	}

}
