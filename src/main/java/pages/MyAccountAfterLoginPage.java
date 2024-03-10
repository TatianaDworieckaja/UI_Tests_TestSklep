package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ProjectProperties;

public class MyAccountAfterLoginPage extends HomePage {

    @FindBy(css = ".woocommerce-MyAccount-content")
    WebElement myAccountContent;

    @FindBy(xpath = "//a[.='Logout']")
    WebElement logoutLink;

    @FindBy(xpath = "//a[.='Confirm and log out']")
    WebElement confirmLogoutLink;

    @FindBy(xpath = "//li[@class='top-cart']")
    WebElement myCartLink;

    public MyAccountAfterLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public String getMyAccountContentText() {
        return myAccountContent.getText();
    }

    public boolean isRegistered(){
        return getMyAccountContentText().contains(extractUserName());
    }
    private String extractUserName() {
        String testEmail = ProjectProperties.getTestRegEmail();
        char[] charArray = testEmail.toCharArray();
        StringBuilder userName = new StringBuilder();
        for (char element : charArray) {
            if (element != '@') {
                userName.append(element);
            } else {
                break;
            }
        }
        return userName.toString();
    }

    public MyCartPage clickMyCartLink() {
        myCartLink.click();
        return new MyCartPage(webDriver);
    }

    public HomePage logout() {
        logoutLink.click();
        confirmLogoutLink.click();
        return new HomePage(webDriver);
    }


}
