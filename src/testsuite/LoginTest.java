package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        // Find login link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        // Find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);
        // Validate actual and expected message
        assertEquals(actualMessage, expectedMessage);

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Sending email to email field element
        emailField.sendKeys("prime123@gmail.com");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        // Sending Password to password field element
        passwordField.sendKeys("Prime123");

        //Find the login button and click on it
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

    }



    @Test
    public void verifyTheErrorMessage() {
        // Find log in link and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Sending email to email field element
        emailField.sendKeys("prime1@gmail.com");

        // Find the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        // Sending Password to password field element
        passwordField.sendKeys("Prime1");

        //Find the login button and click on it
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        // Validate actual and expected message
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }

}



