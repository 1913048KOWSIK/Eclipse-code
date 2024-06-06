package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

@Test
public class Calender {
	WebDriver driver;

	public void DatePicker() throws InterruptedException {

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver =new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://demoqa.com/date-picker");
				
		WebElement tab = driver.findElement(By.id("datePickerMonthYearInput"));
		tab.click();

		WebElement year = driver.findElement(By.xpath("//option[@value='2001']"));
		year.click();
		
		WebElement month = driver.findElement(By.xpath("//option[@value='10']"));
		month.click();
		
		WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--007']"));
		date.click();
	}

	
}
