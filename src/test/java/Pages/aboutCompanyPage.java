package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class aboutCompanyPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[@href='https://letmeknow.online/index.php/en/page/about']")
    private WebElement abtCompany;

    @FindAll
            ({
                @FindBy(className = "page-sidebar"),
            })
    private List<WebElement> text;

    public aboutCompanyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnAbtCompany(){

        abtCompany.click();
    }

    public void checkTheTexts(){
        text.get(0).getText().contains("About US:");
        System.out.println(text.get(0).getText());
        text.get(1).getText().contains("Mail : support@letmeknow.online");
        System.out.println(text.get(1).getText());
    }
}
