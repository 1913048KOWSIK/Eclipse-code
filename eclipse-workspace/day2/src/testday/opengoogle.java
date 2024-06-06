package testday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class opengoogle {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
	
	WebDriver driver =new EdgeDriver();
	
	driver.get("https://www.w3schools.com/java/");
	
	driver.manage().window().maximize();
	
	// id locator
	
	driver.findElement(By.id("gsc-i-id1"));
	
	// name locator
	
	WebElement name = driver.findElement(By.name("fname"));
	
	name.sendKeys("John");
	
	// link text locator
	
	WebElement link = driver.findElement(By.linkText("Learn Java"));
	
	link.click();
	
	// partial link text locator
	
	WebElement partial = driver.findElement(By.partialLinkText("Tutorials"));
	
	partial.click();
	
	
	
	}

}
