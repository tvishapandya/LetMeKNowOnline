package Steps;

import Pages.aboutCompanyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class aboutCompanySteps extends baseClass {

    baseClass base;
    aboutCompanyPage page;

    public aboutCompanySteps(baseClass base){
        this.base = base;
    }

    @Given("User is on the homepage of the website")
    public void user_is_on_the_homepage_of_the_website() {
        base.driver.navigate().to("https://letmeknow.online/");
        // Write code here that turns the phrase above into concrete actions

    }

    @When("user clicks on About Company page")
    public void user_clicks_on_About_Company_page() {
        // Write code here that turns the phrase above into concrete actions
        page = new aboutCompanyPage(base.driver);
        page.clickOnAbtCompany();
    }

    @Then("Required text is there on the page")
    public void required_text_is_there_on_the_page() {
        // Write code here that turns the phrase above into concrete actions
        page.checkTheTexts();
    }

}
