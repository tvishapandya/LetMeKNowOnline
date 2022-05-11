package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks extends baseClass {
    private baseClass base;

    public Hooks(baseClass base){

        this.base = base;
    }

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.get("https://letmeknow.online/");
        base.driver.manage().window().maximize();
        base.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        base.driver.findElement(By.xpath("//button[@class='close']/span")).click();
    }

    @After
    public  void TearDown(){
        base.driver.close();
        base.driver.quit();
    }
}
