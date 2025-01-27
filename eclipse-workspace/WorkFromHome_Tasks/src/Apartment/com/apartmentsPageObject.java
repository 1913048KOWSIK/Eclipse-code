package Apartment.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class apartmentsPageObject {


	WebDriver driver;

	@BeforeTest
	public void OpenBrowser() {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.apartments.com/");
	}

	@Test
	public void Functions() throws InterruptedException {
		apartmentPageFindElements element =  PageFactory.initElements(driver, apartmentPageFindElements.class );
		
		element.search("Sname");
		element.continueButton();
		Thread.sleep(3000);

		element.insideSearch("ISname");
		Thread.sleep(3000);

		element.select();
		Thread.sleep(3000);

		element.photoOfTheHouse();
		Thread.sleep(3000);

		element.closeThePhoto();
		Thread.sleep(2000);

		element.wishlist();
		Thread.sleep(2000);

		element.pricingDetails();
		Thread.sleep(2000);

		element.floorPlanDetails();
		element.tourFlorPlan();
		Thread.sleep(2000);

		element.firstName("Fname");
		element.lastName("Lname");
		element.mailID("mail");
		element.phoneNo("Pno");
		element.rent("amount");
		element.contactVia();
		element.phone();
		element.beds();
		element.bed2();
		element.bath();
		element.bathC();
		element.reason();
		element.moving();
		element.calender();
		element.date();
	}

}
