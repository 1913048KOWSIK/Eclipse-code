package testday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class paetial_Link_Locator {

	public static void main(String[] args) {

System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.w3schools.com");
		
		driver.manage().window().maximize();
		
		// partial link text locator
		
		WebElement partial_Link = driver.findElement(By.partialLinkText("Learn HTML"));
	
		partial_Link.click();
	}

}
