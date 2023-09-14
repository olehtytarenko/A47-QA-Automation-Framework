import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    @Test
    public void LoginEmptyEmailPasswordTest() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        String url = "https://qa.koel.app/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        WebElement login = driver.findElement(By.cssSelector("[type='email']"));
        login.sendKeys("demo@gmail.com");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        password.sendKeys("te$t$tudent");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement submit = driver.findElement(By.cssSelector("[type='submit']"));
        submit.click();

@Test
        public void loginEmailPassword(){
            {

            }
        }

        //driver.quit();


    }
}
