package Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Calender {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\Web Driver\\msedgedriver.exe");

		WebDriver driver =new EdgeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/date-picker");
	
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		
		WebElement month = driver.findElement(By.xpath("//option[@value='10']"));
		month.click();
		
		WebElement year = driver.findElement(By.xpath("//option[@value='2001']"));
		year.click();
		
		WebElement date = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--016']"));
		date.click();
	}

}
