package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class whatsappPage {

    private WebDriver driver;

    @FindBy(linkText = "Whats App")
    private WebElement whatApp_link;

    public whatsappPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnWhatApp_function() {
        whatApp_link.click();
    }

    public void checkWhatsappURL_function() {
        String parent_url = driver.getWindowHandle();
        Set<String> all_urls = driver.getWindowHandles();

        Iterator iter = all_urls.iterator();
        while (iter.hasNext()) {

            String child_url = iter.next().toString();
            if (!parent_url.equals(child_url)) {
                driver.switchTo().window(child_url);
                String currentUrl = driver.getCurrentUrl();
                System.out.println(currentUrl);
                Assert.assertEquals(currentUrl, "https://api.whatsapp.com/send?phone=447440277063&text=Please%20send%20pictures,%20email,%20description%20and%20address%20to%20post%20your%20advert");
            }
        }
    }

}
