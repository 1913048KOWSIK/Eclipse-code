package Weekly_Assessment_21_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CheckBox {

	public static void main(String[] args) {
	

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		
		WebElement check = driver.findElement(By.xpath("//div[@id='post-body-4105674242499183386']//input[@id ='check2']"));

		check.click();
		
		driver.findElement(By.xpath("//div[@id='post-body-4105674242499183386']//input[@id ='check3']")).click();
		
		// remove already markable checkbox
		
		driver.findElement(By.xpath("//div[@id='post-body-4105674242499183386']//input[@id ='check1']")).click();
	}

}
