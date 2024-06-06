package Weekly_Assessment_21_4_24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TextBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		
		WebDriver driver =new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://only-testing-blog.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@name='userid']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//input[@name='pswrd']")).sendKeys("Admin@07");
		
		driver.findElement(By.xpath("//div//input[@type='submit' and @ value = 'Login']")).click();;
	}

}
