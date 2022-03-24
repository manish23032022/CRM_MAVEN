package GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementationClassForITListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("excution========>started");
		
	}

	public void onTestSuccess(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		System.out.println(MethodName+"test execution =========>successful");
	}

	public void onTestFailure(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		System.out.println(MethodName+"test execution =========>failed");
		System.out.println(result.getThrowable());
		
		try {
			new WebDriverUtility().takeScreenshot(BaseClass.sDriver, MethodName);
		}catch(Throwable e){
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		String MethodName=result.getMethod().getMethodName();
		System.out.println(MethodName+"test execution =========>Skipped");
		System.out.println(result.getThrowable());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
		System.out.println("startesd");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finish");
	}
	

}
