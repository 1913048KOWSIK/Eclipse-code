package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Techlistic {

	@Test
	public void checkBox() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		driver.findElement(By.id("profession-0")).click();

		driver.findElement(By.id("profession-1")).click();
		
		driver.findElement(By.id("tool-0")).click();
		
		driver.findElement(By.id("tool-1")).click();
		
		driver.findElement(By.id("tool-2")).click();
	}
}
