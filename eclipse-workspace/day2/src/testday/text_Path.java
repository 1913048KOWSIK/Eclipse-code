package testday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class text_Path {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.w3schools.com/css/default.asp");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text() = 'Go to CSS Examples!']")).click();

	}

}
