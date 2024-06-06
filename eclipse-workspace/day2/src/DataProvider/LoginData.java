package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginData {

	WebDriver driver; 
	
	String[][] data = {
			
			
			{"priyatharsanenjoy20@gmail.com","pd@2004"},
			{"priyatharsanenjoy@gmail.com","pd@200"},
			{"priyatharsanenjoy20@gmail.com","pd@20"},
			{"priyatharsanenjoy@gmail.com","pd@2004"}
			
	};
	
	
	@DataProvider(name ="loginData")
	public String[][] loginDataProvider() {
		return data;
	}
	

	@Test(dataProvider = "loginData")
	public void login(String uname , String pass) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.netflix.com/login");

		WebElement username = driver.findElement(By.id(":r0:"));
		username.sendKeys(uname);
		
		WebElement password = driver.findElement(By.id(":r3:"));
		password.sendKeys(pass);
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
	
		driver.quit();
	}
}