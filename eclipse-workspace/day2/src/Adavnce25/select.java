package Adavnce25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class select {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/selectable/");

		List<WebElement> collection = driver.findElements(By.xpath("//ol[@id='selectable']//li"));
		
		System.out.println(collection.size());
		
		Actions action = new Actions(driver);
		action.clickAndHold(collection.get(1));
		action.clickAndHold(collection.get(3));
		action.build().perform();
		
	}

}
