package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P02_HomePage {
    SHAFT.GUI.WebDriver driver;
    //    Locators
By menListButton=By.xpath("//a[@href='#Men']");
By tShirtListButton=By.xpath("//a[contains(text(),'Tshirts')]");
    //    Constructor
    public P02_HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    //    Methods
    public P03_ProductPage navigateToTShirtProducts() {
        driver.element().click(menListButton)
                .click(tShirtListButton);
        return new P03_ProductPage(driver);
    }

}
