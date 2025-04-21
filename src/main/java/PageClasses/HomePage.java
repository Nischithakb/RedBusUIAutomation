package PageClasses;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {

     WebDriver driver;


    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    private By sourceElement=By.xpath("//input[@id='src']");
    private By sourcePlaceHolder=By.xpath("//text[contains(text(),'Hyderabad')]");
    private By destinationElement=By.xpath("//input[@id='dest']");
    private By selectingDestFromDropDown=By.xpath("//text[text()='Mumbai International Airport']");
    private By monthYearSelector=By.xpath("//div[contains(@class,'DayNavigator__IconBlock-qj8jdz-2')][2]");
    private By arrowElement=By.cssSelector("svg#Layer_1");
    private By dateSelector=By.xpath("(//span[text()='3'])[1]");
    private By searchButton=By.id("search_button");

    public By getSourcePlaceHolder() {
        return sourcePlaceHolder;
    }
    public HomePage source(){
        driver.findElement(sourceElement).sendKeys("Hyderabad");
        BaseClass.wait.until(ExpectedConditions.visibilityOfElementLocated(getSourcePlaceHolder()));
        Actions actions= new Actions(driver);
        actions.keyDown(Keys.ENTER).perform();
        return this;
    }


    public By selectingDestFromDropDown(){
        return selectingDestFromDropDown;
    }
    public HomePage destination(){
        driver.findElement(destinationElement).sendKeys("Mumbai");
        BaseClass.wait.until(ExpectedConditions.visibilityOfElementLocated(selectingDestFromDropDown()));
        return this;
    }
    public HomePage clickonDestination(){
        driver.findElement(selectingDestFromDropDown).click();
        return this;
    }

    public HomePage selectingMonthYearDropDown(){
        while(true) {
            WebElement datePicker = BaseClass.wait.until(ExpectedConditions.visibilityOfElementLocated(monthYearSelector));
            String[] a = datePicker.getText().split("\\n");

            if(a[0].trim().equals("Jun 2025")){
                break;
            }
            List<WebElement> arrowElements = driver.findElements(arrowElement);
            if(arrowElements.size()==1){
                arrowElements.get(0).click();
            }
            else{
                arrowElements.get(1).click();
            }
        }
    return this;
    }
    public HomePage dateSelect(){
        driver.findElement(dateSelector).click();
        return this;
    }

    public void searchButtonSelect(){
        driver.findElement(searchButton).click();
    }

}
