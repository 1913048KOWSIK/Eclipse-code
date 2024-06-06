package Listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listnerProgram implements ITestListener {
	
	@Override
    public void onTestStart(ITestResult result) {
		System.out.println("The test case is going to execute");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
		System.out.println("THe test case is pass");

    }

    @Override
    public void onTestFailure(ITestResult result) {
		System.out.println("The test case is failed");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
		System.out.println("The test case is skipped");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("The test case is fail with better percentage");

    }

    @Override
    public void onStart(ITestContext context) {
		System.out.println("The test case is started");

    }

    @Override
    public void onFinish(ITestContext context) {
		System.out.println("The test case is finish");

    }
}