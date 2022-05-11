package Steps;

import Pages.loginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps extends baseClass {

    baseClass base;
    loginPage page;

    public loginSteps(baseClass base){
        this.base = base;
    }

    @When("User clicks on Signin link")
    public void user_clicks_on_Signin_link() {
        page = new loginPage(base.driver);
        page.ClickOnSignIn();
    }

    @When("clicks on Login button after entering the Email, password")
    public void clicks_on_Login_button_after_entering_the_Email_password() {
        page.LoginFunction("tvishapandya02@gmail.com","Test1234");
    }

    @Then("User panel option displayed. Clicking on that it moves to the profile page where Hello, email id of the user is mentioned.")
    public void user_panel_option_displayed_Clicking_on_that_it_moves_to_the_profile_page_where_Hello_email_id_of_the_user_is_mentioned() {
        page.UserPanelFunction();
    }
}
