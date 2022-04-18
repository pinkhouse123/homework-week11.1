package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Click on Register link
        driver.findElement(By.linkText("Register")).click();
        String expectedResult = "Register";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualResult = message.getText();
        Assert.assertEquals("Not in Register Page", expectedResult, actualResult);

        // Select gender radio button
        driver.findElement(By.xpath("//input[@id='gender-female']")).click();
        // Enter First name
        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Umi");
        // Enter Lash name
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Patel");
        //Select Day Month and Year
        driver.findElement((By.xpath("//select[@name='DateOfBirthDay']"))).sendKeys("14");
        driver.findElement((By.xpath("//select[@name='DateOfBirthMonth']"))).sendKeys("February");
        driver.findElement((By.xpath("//select[@name='DateOfBirthYear']"))).sendKeys("2000");
        //Enter email, password and confirm password
        driver.findElement((By.xpath("//input[@name='Email']"))).sendKeys("umipatel@gmail.com");
        driver.findElement((By.xpath("//input[@id='Company']"))).sendKeys("123abc");
        driver.findElement((By.xpath("//input[@id='Newsletter']"))).click();
        driver.findElement((By.xpath("//input[@id='Password']"))).sendKeys("umi123");
        driver.findElement((By.xpath("//input[@id='ConfirmPassword']"))).sendKeys("umi123");
        // Click Register button
        driver.findElement((By.xpath("//button[@id='register-button']"))).click();


    }

    @After
    public void stop() {
        closeBrowser();

    }

}
