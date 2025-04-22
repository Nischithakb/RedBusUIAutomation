package Utilities;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener{

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenshotUtil.screenshot(BaseClass.driver,result.getName());
    }
}
