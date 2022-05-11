import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginTestscript {

    @Test
    public void Login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        driver.findElement(By.xpath("//button[@class='close']/span")).click();
        driver.findElement(By.cssSelector("a[class='signin']")).click();
        driver.findElement(By.xpath("//input[@name='useremail']")).sendKeys("tvishapandya02@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test1234");
        driver.findElement(By.xpath("//input[@name='yt1']")).click();
        Thread.sleep(5000);

        driver.findElement(By.linkText("User panel")).click();
        String str = driver.findElement(By.xpath("//div[@class='user']")).getText();
        System.out.println(str);
        Assert.assertEquals(str, "Hello, tvishapandya02");
        driver.close();
        driver.quit();
    }

}
