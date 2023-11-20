package testsuite;

import browserfactory.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * 1. userShouldLoginSuccessfullyWithValidCredentials
 * <p>
 * * Enter “Admin” username
 * * Enter “admin123 password
 * * Click on ‘LOGIN’ button
 * * Verify the ‘Dashboard’ text is display
 */
public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() throws InterruptedException {
        //Enter Username :Admin
        driver.findElement(By.xpath("//input[@name='username' and @placeholder='Username']")).sendKeys("Admin");

        //Enter Password :admin123
        driver.findElement(By.xpath("//input[@name='password' and @placeholder='Password']")).sendKeys("admin123");

        //Click on 'Login' button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(4000);
        driver.quit();
    }
}
