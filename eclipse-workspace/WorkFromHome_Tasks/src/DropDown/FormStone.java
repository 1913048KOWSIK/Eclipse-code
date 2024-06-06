package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormStone {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://formstone.it/components/dropdown/demo/");
    }

    @Test
    public void drop1() {
        WebElement drop = driver.findElement(By.id("demo_basic"));
        Select select = new Select(drop);
        select.selectByIndex(1);
    }

    
	@Test
	public void drop2() {
		WebElement drop2 = driver.findElement(By.id("demo_basic_2"));
		
		Select select = new Select(drop2);
		select.selectByVisibleText("Indiana");
	}
	
	@Test
	public void drop4() {
		WebElement drop4 = driver.findElement(By.id("demo_custom_2"));
		
		Select select = new Select(drop4);
		select.selectByIndex(3);
	}
	@Test

	public void drop5() {
		WebElement drop5 = driver.findElement(By.id("demo_links"));
		
		Select select = new Select(drop5);
		select.selectByIndex(2);
	}
	
	@Test

	public void drop3() {
		WebElement drop3 = driver.findElement(By.id("demo_external"));
		
		Select select = new Select(drop3);
		select.selectByIndex(2);
		
	}
	
	
}
