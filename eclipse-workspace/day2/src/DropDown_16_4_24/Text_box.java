package DropDown_16_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Text_box {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
			
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.naukri.com/nlogin/login");
		
		driver.findElement(By.xpath("//input[@ id = 'usernameField']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@ id = 'passwordField']")).sendKeys("Kowsik@123");
		
		driver.findElement(By.xpath("//button[@ class = 'waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
			
	}

}
