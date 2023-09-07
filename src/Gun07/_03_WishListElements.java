package Gun07;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class _03_WishListElements {

    @FindBy(xpath="//button[@data-original-title='Add to Wish List']")
    public List<WebElement> wishButtons;

    @FindBy(xpath="//div[@class='caption']//h4")
    public List<WebElement> productList;

    @FindBy(xpath="//span[contains(text(),'Wish List')]")
    public WebElement wishListLink;

    @FindBy(xpath="//td[@class='text-left']/a")
    public List<WebElement> wishList;



}
