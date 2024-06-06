package Adavnce25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class table {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://leafground.com/table.xhtml");
		
		//td[normalize-space() = 'Darci Ivar']//following::td[1]

	}

}
