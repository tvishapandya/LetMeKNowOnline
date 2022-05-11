package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class faqPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[@href='https://letmeknow.online/index.php/en/page/faqs']")
    private WebElement faqLink;

    @FindAll
            ({
                    @FindBy(tagName = "strong")
            })
    private List<WebElement> faqQestions;

    public faqPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnFaqLink(){
        faqLink.click();
    }

    public void getTheFisrtFaqFunction(){
        String str = faqQestions.get(0).getText();
        System.out.println(str);
    }


}
