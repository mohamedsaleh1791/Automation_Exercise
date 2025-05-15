package tests;

import Pages.P01_LoginPage;
import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class T01AddProductTest {
    SHAFT.GUI.WebDriver driver;
    SHAFT.TestData.JSON testJson;
    SHAFT.TestData.EXCEL testExcel;

    @BeforeClass
    public void setUp() {
        driver = new SHAFT.GUI.WebDriver();
        testJson =new SHAFT.TestData.JSON("data.json");
        testExcel =new SHAFT.TestData.EXCEL("Data.xlsx");
        driver.browser().navigateToURL("https://automationexercise.com/login");
    }
    @Test
    public void addProductsToCart(){
//        String userName = testData.getTestData("userName");
//        String password=testData.getTestData("password");
        String userName = testExcel.getCellData("userName");
        String password = testExcel.getCellData("password");
        new P01_LoginPage(driver).login(userName,password)
                .navigateToTShirtProducts();
        new Pages.P03_ProductPage(driver).getProductsList();

    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
