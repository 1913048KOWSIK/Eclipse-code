package MedPlus_14_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MedPlus_Mart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		// get URL
		
		driver.get("https://www.medplusmart.com/");
		
		// id locator
		
		driver.findElement(By.id("login")).click();
	        
		// name locator
	    
	    driver.findElement(By.name("userid")).sendKeys("your_username");
	    
	    driver.findElement(By.name("password")).sendKeys("your_password");
	       
	    // Class Locator
	    
	    driver.findElement(By.className("sign-btn")).click();
	        
	    //  Tag Name Locator
	    
	    driver.findElement(By.tagName("button")).click();
	        
	    //  Link Text Locator
	    
	    driver.findElement(By.linkText("Login")).click();
	        
	    // Partial Link Text Locator
	    
	    driver.findElement(By.partialLinkText("Log")).click();
	    
	    // close 
	    
	    driver.close();
	        
	}
}
