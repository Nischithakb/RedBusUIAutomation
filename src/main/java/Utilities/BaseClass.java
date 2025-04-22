package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    public static WebDriver driver;
    public static WebDriverWait wait;


    public BaseClass(String driverName){
        driverSetup(driverName);

    }
    public void driverSetup(String drivername) {
        if(drivername.equalsIgnoreCase(PropertiesRead.propertyGet("browsername"))){
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(PropertiesRead.propertyGet("url"));
            wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        }

    }


    public void driverTearDown(WebDriver driver){
        if(driver!=null){
            driver.quit();
        }




    }
}
