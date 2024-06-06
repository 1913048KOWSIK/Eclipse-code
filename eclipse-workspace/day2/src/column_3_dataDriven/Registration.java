package column_3_dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
 
public class Registration {
	
		WebDriver driver;
		
		Object[][] data = null;
		
		public Object[][] getExcel() throws BiffException, IOException {
		    FileInputStream excel = new FileInputStream("C:\\Users\\Kowshik\\Documents\\Registration.xls");
		    
		    Workbook workbook = Workbook.getWorkbook(excel);
		    
		    Sheet sheet = workbook.getSheet(0);
		    
		    int rCount = sheet.getRows();
		    int cCount = sheet.getColumns();
		    
		    Object[][] testData = new Object[rCount - 1][cCount];
		    
		    for (int i = 1; i < rCount; i++) {
		        for (int j = 0; j < cCount; j++) {
		            testData[i - 1][j] = sheet.getCell(j, i).getContents();
		        }
		    }
		    return testData;
		}
		
		@DataProvider(name = "data")
		public Object[][] registerData() throws BiffException, IOException {
			
			data =  getExcel();
			return data;
		}
		@BeforeTest
		public void beforeTest() {
			System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
	 
			driver = new EdgeDriver();
	 
			driver.get("https://demo.automationtesting.in/Register.html");
	 
		}
		
		@Test(dataProvider = "data")
		public void register(String nameF,String nameL,String Address,String mailID) {
			WebElement Fname = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
			Fname.sendKeys(nameF);
			
			WebElement Lname = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
			Lname.sendKeys(nameL);
	 
			WebElement address = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
			address.sendKeys(Address);
			
			WebElement mail = driver.findElement(By.xpath("//*[@id='eid']/input"));
			mail.sendKeys(mailID);
		}
		
	}
	 
