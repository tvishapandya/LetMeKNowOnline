package Steps;

import Pages.whatsappPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class whatsappStep extends baseClass {

    baseClass base;
    whatsappPage page;

    public whatsappStep(baseClass base){
        this.base = base;
    }

    @When("User clicks on Whats app link")
    public void user_clicks_on_Whats_app_link() {
        page = new whatsappPage(base.driver);
        page.clickOnWhatApp_function();
    }

    @Then("User is moved to Whats app chat options")
    public void user_is_moved_to_Whats_app_chat_options() {
        page.checkWhatsappURL_function();
    }

}
