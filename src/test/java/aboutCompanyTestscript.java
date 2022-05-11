import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class aboutCompanyTestscript {

    @Test
    public void About_Company() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        driver.findElement(By.xpath("//a[@href='https://letmeknow.online/index.php/en/page/about']")).click();
        driver.findElements(By.className("page-sidebar")).get(0).getText().contains("About US:");
        driver.findElements(By.className("page-sidebar")).get(1).getText().contains("Mail : support@letmeknow.online");
        driver.close();
        driver.quit();


    }
}
