import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class registerWithFacebookTestscript {

    @Test
    public void Register_with_Facebook(){

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        driver.findElement(By.xpath("//button[@class='close']/span")).click();
        driver.findElement(By.xpath("//a[@class='signup']")).click();
        driver.findElement(By.xpath("//a[@href='https://letmeknow.online/index.php/en/account/newaccount/fb']")).click();
        String url = driver.getCurrentUrl();
        System.out.println("url is:" + url);

        Boolean flag = url.startsWith("https://www.facebook.com/");
        System.out.println("Flag is:"+ flag);
        Assert.assertTrue(flag);

        driver.close();
        driver.quit();

    }
}
