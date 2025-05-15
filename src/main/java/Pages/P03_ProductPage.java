package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_ProductPage {
    SHAFT.GUI.WebDriver driver;
    //    Locators
By productsCard=By.xpath("//div[@class='productinfo text-center']");
By addToCartButton=By.xpath("//div[contains(@class,'productinfo')]/a/i[contains(@class,'fa-shopping-cart')]");
By continueShoopingButton=By.xpath("//div[@class='modal-footer']/button[contains(.,'Shopping')]");
//    Constructor
    public P03_ProductPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    //    Methods
    public void getProductsList() {
       List<WebElement> products= driver.getDriver().findElements(productsCard);
       for(int i=1;i<=products.size();i++) {
           int productprice = Integer.parseInt(driver.getDriver().findElement(By.xpath("(//div[@class='productinfo text-center']/h2)"+"["+i+"]"))
                   .getText().replaceAll("[^0-9]", ""));
           System.out.println("Product price: " + productprice);
           if (productprice>1000){
               driver.getDriver().findElement(By.xpath("(//div[contains(@class,'productinfo')]/a/i[contains(@class,'fa-shopping-cart')])"+"["+i+"]")).click();
                driver.element().click(continueShoopingButton);

           }
       }


    }

}
