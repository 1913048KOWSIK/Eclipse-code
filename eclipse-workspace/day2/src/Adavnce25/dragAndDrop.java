package Adavnce25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://leafground.com/drag.xhtml");

		WebElement from = driver.findElement(By.id("form:drag_content"));

		WebElement to = driver.findElement(By.id("form:drop_content"));

		Actions action = new Actions(driver);
		action.dragAndDrop(from, to).build().perform();


	}

}
