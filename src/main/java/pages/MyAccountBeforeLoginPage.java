package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountBeforeLoginPage extends HomePage {

    @FindBy(css = "h1")
    WebElement myAccountText;
    @FindBy(xpath = "//input[@type = 'email']")
    WebElement emailInput;

    @FindBy(xpath = "//input[@id = 'reg_password']")
    WebElement passwordInput;

    @FindBy(name = "register")
    WebElement submitButton;

    public MyAccountBeforeLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

   //public MyAccountAfterLoginPage registerUser(String emailAddress, String password) {
   //    JavascriptExecutor js = (JavascriptExecutor) webDriver;
   //    js.executeScript("arguments[0].value='" + emailAddress + "';", emailInput);
   //    js.executeScript("arguments[0].value='" + password + "';", passwordInput);
   //    js.executeScript("arguments[0].click();", submitBtn);
   //    return new MyAccountAfterLoginPage();
   //}

    public String getMyAccountText(){
        return myAccountText.getText();
    }

    public void setUsername(String username) {
        emailInput.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public MyAccountAfterLoginPage clickSubmitButton(){
        submitButton.click();
        return new MyAccountAfterLoginPage(webDriver);
    }
}
