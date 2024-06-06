package DropDown_16_4_24;

import 		org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Drop_Down {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
			
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/");
		
		driver.findElement(By.xpath("//i[@class  = 'pi pi-server layout-menuitem-icon']")).click();
		
		driver.findElement(By.xpath("//i[@class = 'pi pi-fw pi-chevron-down layout-menuitem-icon']")).click();
		
		WebElement tool = driver.findElement(By.xpath("//select[@class = 'ui-selectonemenu']"));
		
		Select select = new Select(tool);
		
		select.selectByIndex(0);
	}

}
