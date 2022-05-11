import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class hotCategoriesTestscript {

    @Test
    public void Hot_Category() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        driver.findElement(By.xpath("//button[@class='close']/span")).click();
        List<WebElement> categories = driver.findElements(By.className("category-title"));
        int size = categories.size();

        System.out.println("Size is:"+ size);

        for (int i = 0; i < size; i++){
            System.out.println(categories.get(i).getText());
        }

        driver.close();
        driver.quit();

    }
}
