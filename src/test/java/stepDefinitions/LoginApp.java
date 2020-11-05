package stepDefinitions;

import HelperClasses.PageManagerHelper;
import HelperClasses.StepDefsHook;
import HelperClasses.TestDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginApp{
    private TestDriver testDriver;

    public LoginApp(TestDriver testDriver) {
        this.testDriver = testDriver;
    }

    @Given("Open login page")
    public void open_login_page() {
        testDriver.getStepDefsHook().setUp();
        testDriver.getStepDefsHook().getDriver().get("http://demo.applitools.com/");
    }

    @When("User enter the valid credential")
    public void user_enter_the_valid_credential() {

        testDriver.getPageManagerHelper().getLoginPage().setUserName("testtest@gmail.com");
        testDriver.getPageManagerHelper().getLoginPage().setPassword("test123");

    }

    @Then("User should be navigated to home page")
    public void user_should_be_navigated_to_home_page() {

        testDriver.getPageManagerHelper().getHomePage().getTitle();
        testDriver.getStepDefsHook().tearDown();
    }


}
