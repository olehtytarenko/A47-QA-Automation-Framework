import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest
{
    @Test


    public void LoginEmptyEmailPasswordTest() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);

        String url = "https://qa.koel.app/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);

        //WebElement registration = driver.findElement(By.xpath("//div/a"));
        //registration.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement email = driver.findElement(By.cssSelector("[type='email']"));
        email.sendKeys("demo@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        password.sendKeys("te$t$tudent");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement submit = driver.findElement(By.xpath("//button"));
        submit.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement songs = driver.findElement(By.cssSelector("[href='#!/songs']"));
        songs.click();

        WebElement particularSong = driver.findElement(By.xpath("//*[@id=/'songsWrapper/']/div/div/div[1]/table/tr[3]/td[2]"));


        // I Tried to make a script on myself. I stuck in the spot where I have to make an option click to the song.
        // I found out to enable it I have to use Action Class to make double, drag and option clicks. Pls give advice how to implement Action class here
WebElement addTo = driver.findElement(By.xpath("//li[@class='has-sub']"));
addTo.click();
WebElement favorites = driver.findElement(By.xpath("//li/ul/li[@class='favorite']"));
favorites.click();

//I dont know how to 'catch' pop-up window to get appropriate selector and then check it via assert method

        }
    }

