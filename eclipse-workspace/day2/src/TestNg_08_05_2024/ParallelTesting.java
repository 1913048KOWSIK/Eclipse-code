package TestNg_08_05_2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ParallelTesting {

	WebDriver driver; 


	@Test
	public void amazon() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");
	}
	@Test
	public void filpkart() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
	}
}
