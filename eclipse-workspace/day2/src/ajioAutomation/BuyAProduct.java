package ajioAutomation;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;



public class BuyAProduct {

	WebDriver driver; 

	long startTime; 

	long endTime;



	@BeforeTest

	public void  openBrowser() {

		startTime = System.currentTimeMillis(); 

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		driver = new EdgeDriver();

		driver.manage().window().maximize();



		driver.get("https://www.ajio.com");

	}



	@Test(priority = 0)

	public void searchTheProduct() {

		WebElement search = driver.findElement(By.name("searchVal"));

		search.sendKeys("polo tshirt" + Keys.ENTER);



	}

	

	@Test(priority = 1)

	public void viewTheProduct() {

		

		String parent = driver.getWindowHandle();

		WebElement view = driver.findElement(By.xpath("//img[@src='https://assets.ajio.com/medias/sys_master/root/20220504/23hG/627182daf997dd03e292661f/dnmx_green_slim_fit_polo_t-shirt_with_embroidered_logo.jpg']"));

		view.click();

	}

	

	@Test(priority = 2)

	public void selectSize() {

		Set<String> handles = driver.getWindowHandles();

		for (String newWindow : handles) {

			driver.switchTo().window(newWindow);

		}

		driver.findElement(By.xpath("//div[@class='circle size-variant-item size-instock ']//span[text()='XL']")).click();

	}

	@Test(priority = 3)

	public void addToCart() throws InterruptedException {

		WebElement cart = driver.findElement(By.xpath("//div[@class='btn-gold']"));

		cart.click();
		 
		Thread.sleep(5000);
	}

	@Test(priority = 4)

	public void goToBag() {

		WebElement bag = driver.findElement(By.xpath("//div[@class='ic-cart ']"));
		bag.click();
	}

	@Test(priority = 5)
	public void shipping() {
		WebElement ship = driver.findElement(By.xpath("//button[@class='rilrtl-button button shipping-button']"));
		ship.click();
	}

	@AfterTest
	public void closure() {
		driver.quit();
		
		endTime = System.currentTimeMillis();
		long total = endTime - startTime;
		
		System.out.println("the total time taksen as:" + total);
	}
}
