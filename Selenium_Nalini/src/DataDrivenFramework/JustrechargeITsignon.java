package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JustrechargeITsignon {

	public static void main(String[] args) throws InterruptedException, JXLException, IOException {
		// TODO Auto-generated method stub
		String pathoftheExcelsheet = ".\\Testdata\\TD.xls";
		FileInputStream A = new FileInputStream(pathoftheExcelsheet);
		Workbook w = Workbook.getWorkbook(A);
		//Sheet S = w.getSheet("Sheet1");
		Sheet R = w.getSheet("Sheet3");

		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		// i= row ,J= column
		System.out.println("rowcount in resting "+ R.getRows());
		System.out.println("columncount in retesting  "+R.getColumns());
		
		for (int i = 2; i < R.getRows(); i++) {			
			// driver.findElement(By.Locatername("LocaterValue")).sendKeys("inputData");
			driver.findElement(By.name(R.getCell(1, 2).getContents())).clear();
			driver.findElement(By.name(R.getCell(1, 2).getContents())).sendKeys(R.getCell(2, i).getContents());
			driver.findElement(By.name(R.getCell(1, 3).getContents())).clear();
			driver.findElement(By.name(R.getCell(1, 3).getContents())).sendKeys(R.getCell(3, i).getContents());
			driver.findElement(By.id(R.getCell(1, 4).getContents())).click();
			Thread.sleep(2000);
		}//for loop end

	}

}
