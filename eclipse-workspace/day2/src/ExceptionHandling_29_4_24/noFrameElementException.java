package ExceptionHandling_29_4_24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class noFrameElementException {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node01uhg1y7n05k6z1f4srlms8povy695504.node0");

		driver.switchTo().frame(5);
	}

}
