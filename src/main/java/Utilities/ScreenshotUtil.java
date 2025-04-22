package Utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ScreenshotUtil {

    public static void screenshot(WebDriver driver,String test){
        File failedScreenshot = ((TakesScreenshot) driver
        ).getScreenshotAs(OutputType.FILE);
        String destPath=System.getProperty("user.dir")+"/screenshots/"+test+"_"+System.currentTimeMillis()+".png";
        try {
            Files.copy(failedScreenshot.toPath(), new File(destPath).toPath());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
