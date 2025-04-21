package PageClasses;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ResultsPage {

    WebDriver driver;

    private By successMessageLocator= By.xpath("//div[contains(@class,'new-msg')]");
    private By placeHolders=By.xpath("(//div[contains(@class,'new-msg')])[1]/span");


    public ResultsPage(WebDriver driver){
        this.driver=driver;
    }

    public By getSuccessMessageLocator(){
        return successMessageLocator;

    }

    public String returnActualSource(){
        BaseClass.wait.until(ExpectedConditions.visibilityOfElementLocated(getSuccessMessageLocator()));
        List<WebElement> SourceAndDestination = driver.findElements(placeHolders);
        //System.out.println(SourceAndDestination.get(0).getText());

        return SourceAndDestination.get(0).getText();
    }

    public String returnActualDestination(){
        List<WebElement> SourceAndDestination = driver.findElements(placeHolders);
        //System.out.println(SourceAndDestination.get(0).getText());

        return SourceAndDestination.get(1).getText();
    }

}
