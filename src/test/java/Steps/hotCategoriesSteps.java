package Steps;

import Pages.hotCategoriesPage;
import io.cucumber.java.en.Then;

public class hotCategoriesSteps extends baseClass {

    baseClass base;
    hotCategoriesPage page;

    public hotCategoriesSteps(baseClass base){
        this.base = base;
    }

    @Then("display the hot categories")
    public void display_the_hot_categories() {
        page = new hotCategoriesPage(base.driver);
        page.countHotCategories_function();
    }

}

