package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testSuite {
	
	WebDriver driver;
	long startTime;
	long endtime;
	@BeforeSuite
	public void openBrowser() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void google() {
		driver.get("https://www.google.com/");

	}
	@Test
	public void email() {
		driver.get("https://mail.google.com/mail/u/0/#inbox");	
	}

	@AfterSuite
	public void closeure() {
		driver.quit();
		endtime = System.currentTimeMillis();
		long total = endtime -startTime;
		System.out.println("total duration are: " + total);
	}

}
