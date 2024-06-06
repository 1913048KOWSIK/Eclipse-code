package Adavnce_24_4_24;

import java.util.List;

import org.apache.bcel.verifier.structurals.Frame;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class iFrame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node017vtlc0285myd1bqtwqzwik3zb670729.node0");
		
		// inside frame
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();
		
		driver.switchTo().defaultContent();
		
		//nested frame
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement frame2 = driver.findElement(By.id("Click"));
		frame2.click();
		
		driver.switchTo().defaultContent();
		
		// no.of frame 
		
		List<WebElement> total = driver.findElements(By.tagName("iframe"));
		System.out.println(total.size());
	}

}
