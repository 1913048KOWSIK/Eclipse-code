package DropDown_16_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Using_Diff_Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.netflix.com/login");
		
		driver.manage().window().maximize();
		
		// AND  Xpath
		
		driver.findElement(By.xpath("//input[@id = ':r0:' and @ name = 'userLoginId']")).sendKeys("abc@gmail.com");
		
		// OR Xpath
		
		driver.findElement(By.xpath("//input[@ type = 'password' or @name = 'password']")).sendKeys("1234");
		
		// contains x path
		
		driver.findElement(By.xpath("//button[contains(@type , 'submit')]")).click();
		
	}

}