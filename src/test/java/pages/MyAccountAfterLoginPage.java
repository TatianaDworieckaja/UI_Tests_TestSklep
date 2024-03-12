package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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

    /**
     * this method verified that after user is logged in his name (the part of his email before @) is displayed on the screen
     * private method extractUserName() is used to get username form email
     * @return boolean
     */
    public MyAccountAfterLoginPage verifyIfRegistered(){
        Assert.assertTrue(getMyAccountContentText().contains(extractUserName()));
        return this;
    }

    /**
     * method which extracts usersname from email
     * @return username
     * (e.g. in case of tatiana@gmail.com it returns tatiana)
     */
    private String extractUserName() {
        String testEmail = ProjectProperties.getTestRegEmail();
        char[] charArray = testEmail.toCharArray();
        StringBuilder userName = new StringBuilder();
        for (char element : charArray) {
            if (element != '@') {
                userName.append(element);
            } else {break;}
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
