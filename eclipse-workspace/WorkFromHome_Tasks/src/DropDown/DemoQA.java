package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoQA {
	WebDriver driver;

	@Test(priority = 0)
		public void openBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");

		 driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01gcvmboi38wdq1cw23nrd8fghk1170243.node0");
		}
	@Test(priority = 1)

		public void Index() throws InterruptedException {
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		Select drop = new Select(dropdown);
		
		drop.selectByIndex(1);
	}
	
	
}
