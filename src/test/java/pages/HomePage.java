package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.ProjectProperties;

public class HomePage {
    protected WebDriver webDriver;//visible for those which inherit Page and inside the same package

    @FindBy(linkText = "Account")
    WebElement accountLink;


    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public HomePage verifyHomePageUrl(){
        Assert.assertEquals(webDriver.getCurrentUrl(), ProjectProperties.getBaseUrl(), "Main page is invalid");
        return this;
    }


    public MyAccountBeforeLoginPage clickAccount() {
        accountLink.click();
        return new MyAccountBeforeLoginPage(webDriver);
    }
}
