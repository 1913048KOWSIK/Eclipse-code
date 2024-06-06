package testday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class login_Page {

	public static void main(String[] args) {

	System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.netflix.com/login");
		
		driver.manage().window().maximize();
		
		// name locator
		
		WebElement name = driver.findElement(By.name("userLoginId"));
				
		name.sendKeys("abc@gmail.com");

		
		// id locator
		
		WebElement pass = driver.findElement(By.id(":r3:"));

		pass.sendKeys("Shal@22");
		
		// submit
		
		WebElement submit = driver.findElement(By.xpath("//button[@type = 'button']"));
			
		submit.click();
	}

}
