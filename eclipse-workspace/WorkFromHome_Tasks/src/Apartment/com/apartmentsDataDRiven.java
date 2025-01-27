package Apartment.com;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class apartmentsDataDRiven {

	WebDriver driver;
	
	String[][] data = null;
	
	
	@DataProvider(name ="Customerdata")
	public String[][] customerDetail() throws BiffException, IOException {
		
		data = getexcel();
		return data;
	}
	
	public String[][] getexcel() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\Kowshik\\Documents\\ApartmentsData.xls");
		
		Workbook workbook = Workbook.getWorkbook(excel);

		Sheet sheet = workbook.getSheet(0);
		
		int rCount = sheet.getRows();
		int cCount = sheet.getColumns();
		
		String [][] testdata = new String[rCount-1][cCount];
		
		for(int i = 1; i<rCount; i++) {
			for(int j = 0; j<cCount; j++) {
				testdata[i-1][j] = sheet.getCell(j, i).getContents();
			}
		}
		return testdata;
	}

	@BeforeTest
	public void OpenBrowser() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.apartments.com/");
	}

	@Test(priority = 0)
	public void search() {
		WebElement search = driver.findElement(By.id("quickSearchLookup"));
		search.click();
		search.sendKeys("cochituate,MA");
		driver.findElement(By.xpath("//button[@class='go btn btn-lg btn-primary']")).click();
	}

	@Test(priority = 1)
	public void insideSearch() throws InterruptedException {
		Thread.sleep(3000);
		WebElement sTab = driver.findElement(By.id("searchBarLookup"));
		sTab.click();
		sTab.sendKeys("cochituate,MA" + Keys.ENTER);
	}
    
	@Test(priority = 2)
	public void select() throws InterruptedException {
		Thread.sleep(3000);
		WebElement choose = driver.findElement(By.xpath("//*[@id='placardContainer']/ul/li[3]/article/section/div/div[1]/div[2]/a/div/div/div[1]/div/div/img/following::div[3]/a/div/following::div[1]/a"));
		choose.click();
	}

	@Test(priority = 3)
	public void photoOfTheHouse() throws InterruptedException {
		WebElement photo = driver.findElement(By.xpath("//*[@id='carouselSection']/div[2]/div/ul/li[1]/div/div/div/div"));
		photo.click();
		Thread.sleep(3000);
	}

	@Test(priority = 4)
	public void closeThePhoto() {
		WebElement closePhoto = driver.findElement(By.xpath("//*[@id='js-headerUtilities']/child::*"));
		closePhoto.click();
	}

	@Test(priority = 5)
	public void wishlist() throws InterruptedException {
		Thread.sleep(2000);
		WebElement fav = driver.findElement(By.xpath("//*[@id='propertyHeader']/div[2]/div[1]/div[2]/div[2]/button"));
		fav.click();
	}
 
	@Test(priority = 6)
	public void pricingDetails() throws InterruptedException {
		Thread.sleep(2000);
		WebElement details = driver.findElement(By.xpath("//*[@id='bedsFilterContainer']/div/div/button[2]"));
		details.click();
	}

	@Test(priority = 7)
	public void floorPlanDetails() throws InterruptedException {
		Thread.sleep(2000);
		WebElement planDetail = driver.findElement(By.xpath("//*[@id='pricingView']/div[3]/div/div/div[2]/button/span[2]"));
		planDetail.click();
	}

	@Test(priority = 8)
	public void tourFlorPlan(){
		WebElement tour = driver.findElement(By.xpath("//*[@id='pricingView']/div[3]/div/div/div[1]/div[1]/div/div/button"));
		tour.click();
	}

	@Test(priority = 9, dataProvider = "Customerdata")
	public void customerDetails(String fname, String lname, String mailID, String pno, String dollar) throws InterruptedException {
		Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.xpath("//input[@class='contactFormFirstName input-override']"));
		firstName.sendKeys(fname);

		WebElement lastName = driver.findElement(By.xpath("//input[@class='contactFormLastName input-override']"));
		lastName.sendKeys(lname);

		WebElement emailID = driver.findElement(By.xpath("//input[@class='contactFormEmail input-override']"));
		emailID.sendKeys(mailID);

		WebElement phoneNo = driver.findElement(By.id("phone"));
		phoneNo.sendKeys(pno);

		WebElement rent = driver.findElement(By.id("MaxRent"));
		rent.sendKeys(dollar);

		WebElement contactVia = driver.findElement(By.xpath("//*[@id='ContactViaContainer']/div/button"));
		contactVia.click();
		WebElement phone = driver.findElement(By.xpath("//*[@id='ContactViaContainer']/div/div/ul/li[2]/a"));
		phone.click();

		WebElement beds = driver.findElement(By.xpath("//*[@id='bedContainer']/div/button"));
		beds.click();
		WebElement bed2 = driver.findElement(By.xpath("//*[@id='bedContainer']/div/div/ul/li[4]/a"));
		bed2.click();

		WebElement bath = driver.findElement(By.xpath("//*[@id='bathContainer']/div/button"));
		bath.click();
		WebElement bathC = driver.findElement(By.xpath("//*[@id='bathContainer']/div/div/ul/li[2]/a"));
		bathC.click();

		WebElement reason = driver.findElement(By.xpath("//*[@id='ReasonForMovingContainer']/div/button"));
		reason.click();
		WebElement moving = driver.findElement(By.xpath("//*[@id='ReasonForMovingContainer']/div/div/ul/li[3]/a"));
		moving.click();

		WebElement calender = driver.findElement(By.id("MoveInDate"));
		calender.click();
		WebElement date = driver.findElement(By.xpath("//*[@id='MoveInDateContainer']/div/div[1]/table/tbody/tr[6]/td[6]"));
		date.click();
	}

}
