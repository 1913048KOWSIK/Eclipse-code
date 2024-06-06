package TestNG;

import org.testng.annotations.Test;

public class Priority {

	
	@Test(priority =1)
	public void viewProduct() {
		System.out.println("view the product");
	}
	@Test(priority = 0)
	public void searchProduct() {
		System.out.println("search the product");
	}
	@Test(priority = 2)
	public void compareproduct() {
		System.out.println("compare the product");
	}
	
	@Test(priority = 4)
	public void buyNow() {
		System.out.println("buy the product");
	}
	@Test(priority = 3)
	public void addToCart() {
		System.out.println("add to cart");
	}
}