package amazonAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AutomationScript {
	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void openBrowser(){
		
		startTime = System.currentTimeMillis();
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
		
		driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in");

	}						
	@Test(priority = 0)
	public void searchTheProduct() {

		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("bag" + Keys.ENTER);
	}

	@Test(priority = 1)
	public void viewTheProduct() {
		String parent = driver.getWindowHandle();
		WebElement view = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61JcZZqFheL._AC_UY218_.jpg']"));
		view.click();
	}
	
	@Test(priority = 2)
	public void wishlist() {

		Set<String> handles = driver.getWindowHandles();

		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		WebElement wishlist = driver.findElement(By.id("wishListMainButton"));
		wishlist.click();
		
	}
	
	@Test(priority = 3)
	public void signIn() throws InterruptedException {
		
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("6382626419");
		
		// continue to next step
		 driver.findElement(By.id("continue")).click();
		 
		 // password
		 WebElement password = driver.findElement(By.id("ap_password"));
		 password.sendKeys("6382626419");
		 
		 // sign button
		 driver.findElement(By.id("signInSubmit")).click();
		 
		 Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	public void addToCart() {
		
		 WebElement add = driver.findElement(By.id("add-to-cart-button"));
		 add.click();
	}
	
	@Test(priority = 5)
	public void proceedToBuy() {
		driver.findElement(By.xpath("//input[@data-feature-id='proceed-to-checkout-action']")).click();
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		
		endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("The total time taken as : " + totalTime );
	}
}


