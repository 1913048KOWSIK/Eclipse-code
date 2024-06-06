package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Links {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.navigate().to("https://leafground.com/link.xhtml;jsessionid=node01t6h1duh9gua01jayx55k23w3706656.node0");
		
		driver.findElement(By.linkText("Go to Dashboard")).click();
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Find the URL")).click();
		driver.navigate().back();
		
		WebElement broken = driver.findElement(By.linkText("Broken?"));
		broken.click();
		
		String titleName = driver.getTitle();
		
		if(titleName.contains("404")) {
			System.out.println("broken");
		}else
			System.out.println("not broken");
	}

}
