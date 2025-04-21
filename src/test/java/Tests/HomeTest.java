package Tests;

import PageClasses.HomePage;
import PageClasses.ResultsPage;
import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.*;
import org.testng.annotations.Test;


import java.util.*;

import static Utilities.BaseClass.wait;


public class HomeTest {

    WebDriver driver;

   @Test
    public void SearchBuses() {
       BaseClass base= new BaseClass("chrome");
        driver= BaseClass.driver;

       HomePage homepage=new HomePage(driver);
       homepage.source().destination().clickonDestination().selectingMonthYearDropDown().dateSelect().searchButtonSelect();

       //setTimeout(() => { debugger; }, 2000);
       ResultsPage resultsPage=new ResultsPage(driver);

       Assert.assertEquals("Hyderabad",resultsPage.returnActualSource());
       Assert.assertEquals("Mumbai International Airport, Mumbai",resultsPage.returnActualDestination());

       base.driverTearDown(driver);


    }
}
