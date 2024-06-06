package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Handlings {

	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser(){
			
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	}	
	
	@Test
	public void searchTheProduct() {

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("bag" + Keys.ENTER);
	}
	@Test
	public void viewTheProduct() {
		String parent = driver.getWindowHandle();
		WebElement view = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61JcZZqFheL._AC_UY218_.jpg']"));
		view.click();
	}
	
	@Test
	public void wishlist() {

		Set<String> handles = driver.getWindowHandles();

		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement wishlist = driver.findElement(By.id("wishListMainButton"));
		wishlist.click();
		
	}
}
