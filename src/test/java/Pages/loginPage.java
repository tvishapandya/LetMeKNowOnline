package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginPage {

    private WebDriver driver;

    @FindBy(css = "a[class='signin']")
    private WebElement signInLink;

    @FindBy(xpath = "//input[@name='useremail']")
    private WebElement userEmailText;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordText;

    @FindBy(xpath = "//input[@name='yt1']")
    private WebElement inputButton;

    @FindBy(xpath = "//a[@href='https://letmeknow.online/index.php/en/admin/editprofile']")
    private WebElement userPanelLink;

    @FindBy(xpath = "//div[@class='user']")
    private WebElement str;

    public loginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ClickOnSignIn(){
        signInLink.click();
    }
    public void LoginFunction(String userEmail, String password){
        userEmailText.sendKeys(userEmail);
        passwordText.sendKeys(password);
        inputButton.click();
    }

    public void UserPanelFunction(){
        userPanelLink.click();
        String text = str.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Hello, tvishapandya02");
    }
}
