package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class dataDriven {

WebDriver driver; 
	
	String[][] data = null;
	
	
	@DataProvider(name ="loginData")
	
	public String[][] loginDataProvider() throws BiffException, IOException {
		
		data = getExcelData();
		return data;
	}
	
	public String[][] getExcelData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\Kowshik\\Documents\\netflixLoginData.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);
		
		Sheet sheet = workbook.getSheet(0);
		
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		
		String [][] testData = new String[rowCount -1][columnCount];
		for(int i=1; i<rowCount; i++) {
			for(int j=0; j<columnCount; j++) {
				testData [i-1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testData;
	}
	
	
	@BeforeTest
	public void openUrl() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/login");

	}
	
	@AfterTest
	public void closure() {
		
		driver.quit();
 
	}

	@Test(dataProvider = "loginData")
	public void login(String uname , String pass) {
		
		WebElement username = driver.findElement(By.id(":r0:"));
		username.sendKeys(uname);
		
		WebElement password = driver.findElement(By.id(":r3:"));
		password.sendKeys(pass);
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
	
	}
}
