package TestNg_08_05_2024;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {

	WebDriver driver; 
	

	@BeforeSuite
	public void login() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");
	}
	@Test
	@Parameters("product")
	public void search( String name) {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys(name + Keys.ENTER);
	}
	
	
	
}
