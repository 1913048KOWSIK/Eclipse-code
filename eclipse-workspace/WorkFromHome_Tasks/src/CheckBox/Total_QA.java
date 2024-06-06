package CheckBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Total_QA {

	@Test
	public void checkBox() {

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://total-qa.com/checkbox-example/");
		
		driver.findElement(By.xpath("//div[@class='entry-content']//input[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='entry-content']//input[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='entry-content']//input[3]")).click();
		
		driver.findElement(By.xpath("//div[@class='entry-content']//input[4]")).click();
	}
}
