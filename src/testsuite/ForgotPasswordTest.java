package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/** Write down the following test into
 ‘ForgotPasswordTest’ class
 1. userShouldNavigateToForgotPasswordPageSuccessfully
 * click on the ‘Forgot your password’ link
 * Verify the text ‘Reset Password’
  */
public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfuly()throws InterruptedException{
        driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p[text()='Forgot your password? ']")).click();

        //Verify the text 'Reset password'
        String expectedMessage = "Reset Password";
        WebElement message = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));
        String actualMessage = message.getText();//converting webElement into string
        Assert.assertEquals(expectedMessage, actualMessage);//verifying using the assert method
        Thread.sleep(3000);
        driver.quit();
    }
}
