package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class hotCategoriesPage {

    private WebDriver driver;

    @FindAll
            ({
                    @FindBy(className = "category-title"),
            })
    private List<WebElement> hotCategories;

    public hotCategoriesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void countHotCategories_function(){
        Integer total = hotCategories.size();
        System.out.println(total);

        for(int i=0; i<total; i++){
            System.out.println(hotCategories.get(i).getText());
        }
    }
 }
