package Advance_22_4_24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/autocomplete/");

		WebElement value = driver.findElement(By.id("tags"));
		value.sendKeys("s");

		Thread.sleep(4000);

		List<WebElement> list = driver.findElements(By.xpath("//*[@id='ui-id-1']//li"));
		System.out.println(list.size());

		for (WebElement webElement : list) {
			if( webElement.getText().equals("Scala")) {
				webElement.click();
				System.out.println("Selected");
				break;
			}
		}

	}

}
