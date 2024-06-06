package Automated;

public class Loading_URL {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.medplusmart.com/");
		
		WebElement usernameField = driver.findElement(By.id("username"));
		
		
		
	}

}

