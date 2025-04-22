package Tests;

import PageClasses.HomePage;
import PageClasses.ResultsPage;
import Utilities.BaseClass;
import Utilities.PropertiesRead;

import Utilities.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class HomeTest {

    WebDriver driver;


   @Test
    public void SearchBuses() {
       BaseClass baseClass= new BaseClass(PropertiesRead.propertyGet("browsername"));

       driver= BaseClass.driver;

       HomePage homepage=new HomePage(driver);
       homepage.source().destination().clickonDestination().selectingMonthYearDropDown().dateSelect().searchButtonSelect();

       //setTimeout(() => { debugger; }, 2000);
       ResultsPage resultsPage=new ResultsPage(driver);

       Assert.assertEquals("Hyderabd",resultsPage.returnActualSource());
       Assert.assertEquals("Mumbai International Airport, Mumbai",resultsPage.returnActualDestination());

       baseClass.driverTearDown(driver);


    }
}
