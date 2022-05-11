import Pages.loginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class loginTest {

    private WebDriver driver;

    @BeforeTest
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://letmeknow.online/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
        driver.findElement(By.xpath("//button[@class='close']/span")).click();
    }

    @Test
    public void Login_Function() throws InterruptedException {
        loginPage page = new loginPage(driver);
        page.ClickOnSignIn();
        page.LoginFunction("tvishapandya02@gmail.com","Test1234");
        page.UserPanelFunction();
    }

    @AfterTest
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
