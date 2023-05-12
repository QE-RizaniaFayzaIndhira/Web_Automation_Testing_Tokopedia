package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    HomePage homePage;
    LoginPage loginPage;

    @Given("user on home page")
    public void userOnHomePage() {
        homePage.onHomePage();
    }

    @And("user click login")
    public void userClickLogin() {
        homePage.open();
        homePage.clickLogin();
    }

    @And("user on login page")
    public void userOnLoginPage() {
        loginPage.onLoginPage();
    }

    @When("user input valid email")
    public void userInputValidEmail() {
        loginPage.inputValidEmail("rizaniafayza@gmail.com");
    }

    @And("user click next button")
    public void userClickNextButton() {
        loginPage.clickNext();
    }

    @And("user input valid password")
    public void userInputValidPassword() {
        loginPage.inputValidPassword("indhira1");
    }

    @And("user click login button")
    public void userClickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("user on home page successfully")
    public void userOnHomePageSuccessfully() {
        homePage.onHomePageSuccessfully();
    }
}
