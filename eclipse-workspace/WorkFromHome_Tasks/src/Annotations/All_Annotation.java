package Annotations;



	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

	public class All_Annotation {


	    WebDriver driver;
	    long startTime;
	    long endTime;

	    @BeforeSuite
	    public void setUp() {
	        startTime = System.currentTimeMillis();
	        System.setProperty("webdriver.edge.driver", "C:\\Users\\Kowshik\\Music\\driver\\edgedriver_win64 (1)\\msedgedriver.exe");
	    }

	    @BeforeMethod
	    public void openBrowser() {
	        driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.amazon.in");
	    }

	    @Test
	    public void searchTheProduct() {
	        WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	        search.sendKeys("bag" + Keys.ENTER);
	    }

	    @Test
	    public void viewTheProduct() {
			String parent = driver.getWindowHandle();

	        WebElement view = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/61JcZZqFheL._AC_UY218_.jpg']"));
	        view.click();
	    }

	    @Test
	    public void wishlist() {
	        Set<String> handles = driver.getWindowHandles();
	        for (String newWindow : handles) {
	            driver.switchTo().window(newWindow);
	        }
	        WebElement wishlist = driver.findElement(By.id("wishListMainButton"));
	        wishlist.click();
	    }

	    @Test
	    public void signIn() {
	        WebElement email = driver.findElement(By.id("ap_email"));
	        email.sendKeys("6382626419");

	        // Continue to next step
	        driver.findElement(By.id("continue")).click();

	        // Password
	        WebElement password = driver.findElement(By.id("ap_password"));
	        password.sendKeys("6382626419");

	        // Sign in button
	        driver.findElement(By.id("signInSubmit")).click();
	    }

	    @Test
	    public void addToCart() {
	        driver.findElement(By.id("add-to-cart-button")).click();
	    }

	    @Test
	    public void proceedToBuy() {
	        driver.findElement(By.xpath("//input[@data-feature-id='proceed-to-checkout-action']")).click();
	    }

	    @AfterMethod
	    public void closeBrowser() {
	            driver.quit();
	        
	    }

	    @AfterSuite
	    public void tearDown() {
	        endTime = System.currentTimeMillis();
	        long totalTime = endTime - startTime;
	        System.out.println("The total time taken is: " + totalTime);
	    }
	}

