package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //Click on 'Computers' Tab
        WebElement computers = driver.findElement(By.linkText("Computers"));
        computers.click();
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //Click on 'Electronics' Tab
        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        electronics.click();
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //Click on 'Apparel' Tab
        WebElement apparel = driver.findElement(By.linkText("Apparel"));
        apparel.click();
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //Click on 'Digital downloads' Tab
        WebElement digitalDownloads = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloads.click();
    }

    @Test
    public void  userShouldNavigateToBooksPageSuccessfully() {
        //Click on 'Books' Tab
        WebElement books = driver.findElement(By.linkText("Books"));
        books.click();
    }

    @Test
    public void  userShouldNavigateToJewelryPageSuccessfully() {
        //Click on 'Jewelry' Tab
        WebElement jewelry = driver.findElement(By.linkText("Jewelry"));
        jewelry.click();
    }

    @Test
    public void  userShouldNavigateToGiftCardsPageSuccessfully() {
        //Click on 'Gift Cards' Tab
        WebElement giftCards = driver.findElement(By.linkText("Gift Cards"));
        giftCards.click();
    }

    @After
    public void stop() {
        closeBrowser();

    }
}