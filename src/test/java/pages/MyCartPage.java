package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyCartPage extends BasePage {

    private static final By MY_CART_BTN_LOCATOR = By.xpath("//li[@class='top-cart']");
    private static final By CART_ITEMS_LOCATOR = By.xpath("//tr[@class = 'woocommerce-cart-form__cart-item cart_item']");

    public void openPage() {
        openPage(MY_CART_BTN_LOCATOR);
    }

    public List<WebElement> getCartItems() {
        return getElements(CART_ITEMS_LOCATOR);
    }

}
