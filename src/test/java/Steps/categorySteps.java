package Steps;

import Pages.categoryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class categorySteps extends baseClass {

    baseClass base;
    categoryPage page;

    public categorySteps(baseClass base){
        this.base = base;
    }

    @When("User clicks on the Categories dropdown menu")
    public void user_clicks_on_the_Categories_dropdown_menu() {
        page = new categoryPage(base.driver);
        page.clickOnCategoriesLink();
    }

    @When("User clicks on Jobs option from the menu")
    public void user_clicks_on_Jobs_option_from_the_menu() {
        page.clickOnJobsLink();
    }

    @Then("Not more than ten jobs are listed on the page")
    public void notMoreThanTenJobsAreListedOnThePage() {
        page.fetchJobsFunction();
    }
}
