package Xpath;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;
	
	public class Copy_And_Customized {



		WebDriver driver; 

		@BeforeSuite
		public void grtURl() {
			System.setProperty("webdriver.edge.driver","C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");

			driver = new EdgeDriver();
			driver.manage().window().maximize();

			driver.get("https://www.goibibo.com/");


		}
		@Test(priority = 0)
		public void cancel() throws InterruptedException {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		}

		@Test(priority = 1)
		public void Bus() {
			driver.findElement(By.xpath("//span[@class='sc-1f95z5i-4 drxYQA'][text()='Bus']")).click();
		}

		@Test(priority = 2)
		public void from() throws InterruptedException {
			WebElement from = driver.findElement(By.name("autosuggestBusSRPSrcHomeName"));
			from.sendKeys("bhavani");

			Thread.sleep(4000);

			List<WebElement> lists = driver.findElements(By.xpath("//div[@id='downshift-1-menu']/div/li"));
			System.out.println("The total lists for from :" + lists.size());

			for (WebElement webElement : lists) {
				if(webElement.getText().equals("Bhavani, Tamil Nadu"));
				webElement.click();
				break;
			}
		}

		@Test(priority = 3)
		public void to() throws InterruptedException {
			WebElement to = driver.findElement(By.name("autosuggest"));
			to.sendKeys("sollinganallur");

			Thread.sleep(4000);

			List<WebElement> toList = driver.findElements(By.xpath("//div[@id='downshift-2-menu']//div/li"));
			System.out.println("the total list for to :" + toList.size());

			for (WebElement webElement : toList) {
				if(webElement.getText().equals("Sholinganallur, Chennai"));
				webElement.click();
				break;
			}
		}
		
		@Test(priority = 4)

		public void datePicker() {
			WebElement date = driver.findElement(By.xpath("//div[@class='SearchWidgetstyles__DateWrapper-sc-1mr4hwz-3 cuTZWV']/input"));
			date.click();

			WebElement picker = driver.findElement(By.xpath("//*[@id='root']/section/section/section[1]/section/div[3]/div/div[1]/div/div/div[2]/div/div/ul[2]/li[33]/span"));
			picker.click();
		}

		@Test(priority = 5)

		public void searchBus() throws InterruptedException {
			WebElement search = driver.findElement(By.xpath("//div[@class='SearchWidgetstyles__ButtonWrap-sc-1mr4hwz-7 bXLXuO']/child::*"));
			search.click();

			Thread.sleep(2000);
		}

		@Test(priority = 6)
		public void selectButton() throws InterruptedException {

			Thread.sleep(5000);
			WebElement button = driver.findElement(By.xpath("//div[@id='srpCardLayoutinner']/div[4]/div/div[2]/div[2]/p[text()='Sri Auto Travels']/following::div[12]/button/div/span"));
			button.click();
		}

		@Test(priority = 7)
		public void selectSeat() throws InterruptedException {
			
			Thread.sleep(2000);
			WebElement seat = driver.findElement(By.xpath("//div[@id='seatSectionredbusnew5000632048940813251']/div/section[2]/section/div[2]/div[3]/aside[2]/div/div[13]/div"));
			seat.click();
		}

		@Test(priority = 8)
		public void droppingPoint() {
			WebElement drop = driver.findElement(By.xpath("//div[@class='SelectSeatTabContentstyles__StepContentWrap-sc-aw7o7o-3 hmyVUR stepOneWrap']/div[2]/div/label[11]/label/span[1]"));
			drop.click();
		}

		@Test(priority = 9)
		public void continueButton() {
			WebElement continueButton = driver.findElement(By.xpath("//*[@id='seatSectionredbusnew5000632048940813251']/div/section[2]/section/div[2]/button"));
			continueButton.click();
		}
		
	}


