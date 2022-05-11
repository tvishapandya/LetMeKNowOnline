package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class registerWithFacebookPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[@class='signup']")
    private WebElement signUp_link;

    @FindBy(xpath = "//a[@href='https://letmeknow.online/index.php/en/account/newaccount/fb']")
    private WebElement registerFacebook_link;

    public registerWithFacebookPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnSignUpLink_function(){
        signUp_link.click();
    }

    public void clickOnRgsterWithFacebook_function(){
        registerFacebook_link.click();
    }

    public void checkURL_function(){
        String url = driver.getCurrentUrl();
        System.out.println("url is:" + url);

        Boolean flag = url.startsWith("https://www.facebook.com/");
        System.out.println("Flag is:"+ flag);
        Assert.assertTrue(flag);
    }
}
