package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyCartPage extends HomePage {

    @FindBy(xpath = "//tr[@class = 'woocommerce-cart-form__cart-item cart_item']")
    List<WebElement> cartItems;
    @FindBy(xpath = "//li[@class = 'top-account']")
    WebElement accountLink;

    public MyCartPage(WebDriver webDriver){
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public List<WebElement> getCartItems() {
        return cartItems;
    }

    public MyAccountAfterLoginPage clickAccountLink(){
        accountLink.click();
        return new MyAccountAfterLoginPage(webDriver);
    }
}
