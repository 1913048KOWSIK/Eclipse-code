package Listners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TextBox {


	WebDriver driver;
	
	@Test(priority = 0)

	public void openBrowser() {

	System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
	
	 driver =new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://only-testing-blog.blogspot.com/");
	
	}
	@Test(priority = 1)

	public void usernmae() {
	
	driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("admin@123");
	
	
	driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("Admin@07");
	}
	
	@Test(priority = 2)
	public void submit() {
	
	driver.findElement(By.xpath("//div//input[@type='submit' and @ value = 'Login']")).click();
	}
}