package Steps;

import Pages.registerWithFacebookPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerWithFacebookSteps extends baseClass {
    baseClass base;
    registerWithFacebookPage page;

    public registerWithFacebookSteps(baseClass base){
        this.base = base;
    }

    @When("User clicks on Sign Up link")
    public void user_clicks_on_Sign_Up_link() {
        page = new registerWithFacebookPage(base.driver);
        page.clickOnSignUpLink_function();
    }

    @When("User clicks on Register with Facebook button")
    public void user_clicks_on_Register_with_Facebook_button() {
        page.clickOnRgsterWithFacebook_function();
    }

    @Then("It moves to the Facebook page")
    public void it_moves_to_the_Facebook_page() {
        page.checkURL_function();
    }
}
