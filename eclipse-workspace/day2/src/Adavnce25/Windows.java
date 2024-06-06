package Adavnce25;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Windows {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/window.xhtml;jsessionid=node012yr91vs1aitd1pqn9dbk846un675222.node0");
		
		String parentwindow = driver.getWindowHandle();
		
		WebElement button1 = driver.findElement(By.id("j_idt88:new"));
		button1.click();
		
		Set<String> allWindow =	driver.getWindowHandles();
		
		for (String newWindow : allWindow) {
			driver.switchTo().window(newWindow);
		}
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("message")).sendKeys("hi");
		
		driver.switchTo().window(parentwindow);

	}

}
