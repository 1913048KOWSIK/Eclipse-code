package TestNG;

import org.testng.annotations.Test;

public class Dependencies {


	@Test(dependsOnMethods ="searchProduct")
	public void viewProduct() {
		System.out.println("view the product");
	}
	
	@Test
	public void searchProduct() {
		System.out.println("search the product");
	}
	
	@Test(dependsOnMethods = "viewProduct")
	public void compareproduct() {
		System.out.println("compare the product");
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void buyNow() {
		System.out.println("buy the product");
	}
	
	@Test(dependsOnMethods = "compareproduct")
	public void addToCart() {
		System.out.println("add to cart");
	}
}
