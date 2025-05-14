package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class P01_LoginPage {
    SHAFT.GUI.WebDriver driver;
    //    Locators
    By emailInput = By.xpath("//input[@data-qa='login-email']");
    By passwordInput = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[@data-qa='login-button']");
    //    Constructor
    public P01_LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }
    //    Methods
    public P02_HomePage login(String userName, String password) {
         driver.element().type(emailInput,userName)
                .type(passwordInput,password)
                .click(loginButton);
         return new P02_HomePage(driver);
    }
}
