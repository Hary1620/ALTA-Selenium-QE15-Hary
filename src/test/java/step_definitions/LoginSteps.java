package step_definitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private final WebDriver driver = Hooks.driver;
    LoginPage loginPage = new LoginPage(driver);
    @Given("User open the web sauce demo")
    public void userOpenTheWebSauceDemo() {
        Assert.assertTrue(loginPage.verifyLoginPage());
    }

    @When("User input {string} as userName and {string} as password and click login")
    public void userInputAsUserNameAndAsPasswordAndClickLogin(String username, String password) {
        loginPage.inputFieldUserName(username);
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();
    }

    @Then("User should be directed to the dashboard page")
    public void userShouldBeDirectedToTheDashboardPage() {
        Assert.assertTrue(loginPage.verifyLabelProduct());
    }


//    Scenario: Login with locked-out user


    @Then("system gives pop up message {string}")
    public void systemGivesPopUpMessage(String expectedMessage) {
        String actualMessage = loginPage.getPopUpMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

//    @Then("User should not be directed to the dashboard page")
//    public void userShouldNotBeDirectedToTheDashboardPage() {
//        Assert.assertFalse(loginPage.loginpage());
////        Assert.assertTrue(loginPage.loginpage());
//    }



    @Given("User login with valid username {string} and password {string}")
    public void userLoginWithValidUsernameAndPassword(String username, String password) {
        loginPage.inputFieldUserName(username);
        loginPage.inputFieldPassword(password);
        loginPage.clickButtonLogin();
    }


    @Then("User should be directed to the problem dashboard page")
    public void userShouldBeDirectedToTheProblemDashboardPage() {
        Assert.assertTrue(loginPage.verifyproblemdashboard());
    }
}
