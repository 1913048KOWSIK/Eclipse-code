package Adavnce25;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class down {

	public static void main(String[] args) {
	


		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/file.xhtml");
	
		driver.findElement(By.id("j_idt93:j_idt95")).click();
		
		File location = new File("C:\\Users\\Kowshik\\Downloads");
		
		File[] total =	location.listFiles();
		
		for (File file : total) {
			
			if(file.getName().equals("TestLeaf Logo")) {
				System.out.println("downloaded");
				break;
			}
		}
	}

}
