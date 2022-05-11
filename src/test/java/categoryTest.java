import Pages.categoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class categoryTest {

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
    public void CategoryJobsFunction() throws InterruptedException {
        categoryPage page = new categoryPage(driver);
        page.clickOnCategoriesLink();
        page.clickOnJobsLink();
        page.fetchJobsFunction();

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
