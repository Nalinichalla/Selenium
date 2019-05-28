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

public class CollegeWeekLive {

	public static void main(String[] args) throws JXLException, IOException, Exception {
		// TODO Auto-generated method stub
		String PathofExcelsheet = ".\\Testdata\\CollegeweekliveTestData.xls";
		FileInputStream A = new FileInputStream(PathofExcelsheet);
		Workbook B = Workbook.getWorkbook(A);
		Sheet S = B.getSheet("Sheet3");
		System.setProperty("webdriver.chrome.driver", ".\\Browser drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.collegeweeklive.com/go-signup/go-signup2");
		Thread.sleep(5000);
		System.out.println("Rowcount in Sheet3" + S.getRows());
		System.out.println("Columncount in Sheet3" + S.getColumns());
		for (int j = 3; j < S.getColumns(); j++) {
			for (int i = 2; i < 4;i++) {				
				System.out.println(S.getCell(j, i).getContents());
				//Firstname
				driver.findElement(By.id(S.getCell(2, 2).getContents())).clear();
				driver.findElement(By.id(S.getCell(2, 2).getContents())).sendKeys(S.getCell(j, i).getContents());
				//Lastname
				driver.findElement(By.id(S.getCell(2, 3).getContents())).clear();
				driver.findElement(By.id(S.getCell(2, 3).getContents())).sendKeys(S.getCell(j, i).getContents());
				
				
			}//i for loop end
		}//j for loop end

	}

}
