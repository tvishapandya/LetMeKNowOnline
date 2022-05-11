import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;

@Test
public class categoryTestscript {

    @Test
    public void Category() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        driver.findElement(By.xpath("//button[@class='close']/span")).click();
        driver.findElement(By.className("dropdown-toggle")).click();
        driver.findElement(By.xpath("//a[@href='https://letmeknow.online/index.php/en/get_advanced_search_result/category=7+city=+plainkey=Jobs']")).click();

        ArrayList<WebElement> lst = (ArrayList<WebElement>) driver.findElements(By.xpath("//div[@class='ad-item row']"));
        Thread.sleep(5000);
        int lst_size = lst.size();
        System.out.println("List sie is:"+ lst_size);
        Assert.assertTrue(lst_size <= 10);


        driver.close();
        driver.quit();


    }
}
