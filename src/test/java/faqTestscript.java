import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class faqTestscript {

    @Test
    public void method1() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofDays(5000));
        Thread.sleep(5000);

        driver.findElement(By.xpath("//button[@class='close']/span")).click();
        driver.findElement(By.xpath("//a[@href='https://letmeknow.online/index.php/en/page/faqs']")).click();
        Thread.sleep(5000);
        String str = driver.findElements(By.tagName("strong")).get(0).getText();
        System.out.println("Fisrt FAQ is:" + str);
        driver.close();
    }
}
