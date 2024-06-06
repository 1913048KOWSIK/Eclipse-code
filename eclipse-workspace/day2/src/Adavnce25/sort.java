package Adavnce25;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sort {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/sortable/");

		List<WebElement> group = driver.findElements(By.xpath("//ul[@id='sortable']//li"));
		
		WebElement from = group.get(5);
		WebElement to = group.get(2);
		
		Actions action = new Actions(driver);
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to).build().perform();
	}

}
