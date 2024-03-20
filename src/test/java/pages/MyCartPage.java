//package pages;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
//
//import java.util.List;
//
//public class MyCartPage extends HomePage {
//
//    @FindBy(xpath = "//tr[@class = 'woocommerce-cart-form__cart-item cart_item']")
//    List<WebElement> cartItems;
//    @FindBy(xpath = "//li[@class = 'top-account']")
//    WebElement accountLink;
//
//    public MyCartPage(WebDriver webDriver){
//        super(webDriver);
//        PageFactory.initElements(webDriver, this);
//    }
//
//    public MyCartPage verifyCartIsEmpty(){
//        Assert.assertTrue(getCartItems().isEmpty());
//        return this;
//    }
//
//    public List<WebElement> getCartItems() {
//        return cartItems;
//    }
//
//    public MyAccountAfterLoginPage continueToMyAccount() {
//        accountLink.click();
//        return new MyAccountAfterLoginPage(webDriver);
//    }
//}
