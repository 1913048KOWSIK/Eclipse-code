package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Registration_Form {

	
	@Test
	@Parameters({"first name","last name" ,"address","emailID"})
	
	public void register(String nameF,String nameL,String Address,String mailID) {
		
		System.setProperty("webdriver.edge.driver","C:\\\\Users\\\\Kowshik\\\\Music\\\\driver\\\\edgedriver_win64 (1)\\\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement Fname = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
		Fname.sendKeys(nameF);
		
		WebElement Lname = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
		Lname.sendKeys(nameL);
 
		WebElement address = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div/textarea"));
		address.sendKeys(Address);
		
		WebElement mail = driver.findElement(By.xpath("//*[@id='eid']/input"));
		mail.sendKeys(mailID);
	}

}
