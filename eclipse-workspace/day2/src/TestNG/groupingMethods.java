package TestNG;

import org.testng.annotations.Test;

public class groupingMethods {


	@Test(groups = {"website"})
	public void searchProduct() {
		System.out.println("search the product");
	}
	@Test(groups = {"website"})
	public void viewProduct() {
		System.out.println("view the product");
	}
	@Test(groups = {"website"})
	public void compareproduct() {
		System.out.println("compare the product");
	}
	@Test(groups = {"website"})
	public void addToCart() {
		System.out.println("add to cart");
	}
	@Test(groups = {"payment"})
	public void buyNow() {
		System.out.println("buy the product");
	}
	@Test(groups = {"payment"})
	public void PhonePay() {
		System.out.println("phonePay");
	}

}
