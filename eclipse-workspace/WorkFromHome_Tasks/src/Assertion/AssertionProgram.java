package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionProgram {

	@Test
	public void Equal() {
		String name = "kowsik";
		
		Assert.assertEquals(name, "kowsik");
	}
	
	@Test
	public void booleanCheck() {
		Boolean value = false;
		
		Assert.assertEquals(value, false);
	}
	@Test

	public void booleanMessage() {
		boolean value = true;
		
		Assert.assertEquals(value, true, "This is the message");
	}
}
