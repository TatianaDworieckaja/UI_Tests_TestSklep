package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Browser;

import java.util.List;

public class BasePage {

    public void openPage(By locator){
        getElement(locator).click();
    }

    public WebElement getElement(By locator){
        return Browser.getDriver().findElement(locator);
    }

    public List<WebElement> getElements(By locator){
        return Browser.getDriver().findElements(locator);
    }

}
