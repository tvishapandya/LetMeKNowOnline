import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class whatsappTestscript {

    @Test
    public void Whatsapp(){

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        driver.findElement(By.xpath("//button[@class='close']/span")).click();
        driver.findElement(By.linkText("Whats App")).click();

        String url = driver.getCurrentUrl();
        System.out.println(url);

        String parent_url = driver.getWindowHandle();
        Set<String> all_urls = driver.getWindowHandles();

        Iterator iter = all_urls.iterator();
        while(iter.hasNext()){

            String child_url = iter.next().toString();
            if(!parent_url.equals(child_url)){
                driver.switchTo().window(child_url);
                String currentUrl = driver.getCurrentUrl();
                System.out.println(currentUrl);
                Assert.assertEquals(currentUrl, "https://api.whatsapp.com/send?phone=447440277063&text=Please%20send%20pictures,%20email,%20description%20and%20address%20to%20post%20your%20advert");
            }

        }

        driver.close();
        driver.quit();


    }
}
