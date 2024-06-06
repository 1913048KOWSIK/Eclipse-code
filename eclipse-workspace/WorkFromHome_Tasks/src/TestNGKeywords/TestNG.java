package TestNGKeywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNG {

	WebDriver driver;
	
	@Test

	public void openBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");

		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/login");

	}
	
	@Test(dependsOnMethods = "openBrowser")

	public void Login() {
		WebElement username = driver.findElement(By.id(":r0:"));
		username.sendKeys("priyatharsanenjoy20@gmail.com");
		
		WebElement password = driver.findElement(By.id(":r3:"));
		password.sendKeys("pd@2004");
	}
	
	@Test(enabled = false)
	public void closure() {
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();

	}
}
