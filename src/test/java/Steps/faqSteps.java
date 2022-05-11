package Steps;

import Pages.faqPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class faqSteps extends baseClass {

    baseClass base;
    faqPage page;

    public faqSteps(baseClass base){
        this.base = base;
    }

    @When("User clicks on FAQ link")
    public void user_clicks_on_FAQ_link() {
        page = new faqPage(base.driver);
        page.clickOnFaqLink();
    }

    @Then("Fetch the first question from the page")
    public void fetch_the_first_question_from_the_page() {
        page.getTheFisrtFaqFunction();
    }
}
