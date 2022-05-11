import Pages.aboutCompanyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class aboutCompanyTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.xpath("//button[@class='close']/span")).click();
    }
    @Test
    public void aboutUsFunction() throws InterruptedException {
        aboutCompanyPage page = new aboutCompanyPage(driver);
        page.clickOnAbtCompany();
        page.checkTheTexts();
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
