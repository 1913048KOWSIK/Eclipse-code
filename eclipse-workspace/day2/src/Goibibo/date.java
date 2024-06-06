package Goibibo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class date {
	WebDriver driver; 

	@Test
	public void date() {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.goibibo.com/bus/");
		
		WebElement date = driver.findElement(By.xpath("//div[@class='SearchWidgetstyles__DateWrapper-sc-1mr4hwz-3 cuTZWV']/input"));
		date.click();
		
		WebElement picker = driver.findElement(By.xpath("//*[@id=\"root\"]/section/section/section[1]/section/div[3]/div/div[1]/div/div/div[2]/div/div/ul[2]/li[28]/span"));
		picker.click();
	
	}

}
