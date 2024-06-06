package Weekly_Assessment_21_4_24;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_Testing {

	public static void main(String[] args) {


		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		
		driver.findElement(By.xpath("//div[@id = 'post-body-6455223446070396919']//input[@name='fname']")).sendKeys("admin");
		
		driver.findElement(By.xpath("//div[@id = 'post-body-6455223446070396919']//input[@name='lname']")).sendKeys("check");
		
		WebElement submit = driver.findElement(By.xpath("//div[@id='post-body-6455223446070396919']//input[@id='submitButton']"));
		
		submit.click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
	}

}
