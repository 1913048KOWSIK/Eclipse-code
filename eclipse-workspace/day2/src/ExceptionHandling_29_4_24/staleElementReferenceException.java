package ExceptionHandling_29_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class staleElementReferenceException {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		WebElement search = driver.findElement(By.id("APjFqb"));
		search.sendKeys("english to tamil" + Keys.ENTER);
		
		search.clear();
	}

}
