package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class categoryPage {

    private WebDriver driver;

    @FindBy(className = "dropdown-toggle")
    private WebElement categoriesLink;

    @FindBy(xpath = "//a[@href='https://letmeknow.online/index.php/en/get_advanced_search_result/category=7+city=+plainkey=Jobs']")
    private WebElement jobsLink;

    @FindAll
            ({
            @FindBy(xpath = "//div[@class='ad-item row']"),
            })
    private List<WebElement> jobsList;

    public categoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnCategoriesLink(){
        categoriesLink.click();
    }

    public void clickOnJobsLink(){
        jobsLink.click();
    }

    public void fetchJobsFunction(){
        Integer totalJobs = jobsList.size();
        System.out.println(totalJobs);
        Assert.assertTrue(totalJobs <= 10);
    }

}
