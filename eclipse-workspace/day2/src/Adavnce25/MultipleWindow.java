package Adavnce25;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MultipleWindow {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://leafground.com/window.xhtml;jsessionid=node012yr91vs1aitd1pqn9dbk846un675222.node0");

		String parentWindow = driver.getWindowHandle();

		WebElement button = driver.findElement(By.id("j_idt88:j_idt91"));
		button.click();

		Set<String> handles = driver.getWindowHandles();

		for (String allWindow : handles) {
			if(!allWindow.equals(parentWindow)) {
				driver.switchTo().window(allWindow);
				driver.close();
			}
		}
		
	}

}
