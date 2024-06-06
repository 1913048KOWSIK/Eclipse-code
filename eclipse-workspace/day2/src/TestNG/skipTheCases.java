package TestNG;

import org.testng.annotations.Test;

public class skipTheCases {

	
	@Test
	public void searchProduct() {
		System.out.println("search the product");
	}
	@Test(enabled = false)
	public void viewProduct() {
		System.out.println("view the product");
	}
	@Test
	public void compareproduct() {
		System.out.println("compare the product");
	}
	@Test(enabled = false)
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test
	public void buyNow() {
		System.out.println("buy the product");
	}
}
