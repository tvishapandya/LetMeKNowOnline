import Pages.registerWithFacebookPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class registerWithFacebookTest {

    private WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.xpath("//button[@class='close']/span")).click();
    }

    @Test
    public void RegisterWtihFacebook_Function() throws InterruptedException {
        registerWithFacebookPage page = new registerWithFacebookPage(driver);
        page.clickOnSignUpLink_function();
        page.clickOnRgsterWithFacebook_function();
        page.checkURL_function();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
