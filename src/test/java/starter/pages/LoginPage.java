package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By titleLoginPage(){
        return By.xpath("//h3[text()='Masuk']");
    }

    private By emailField(){
        return By.id("email-phone");
    }

    private By nextButton(){
        return By.id("email-phone-submit");
    }

    private By passwordField(){
        return By.id("password-input");
    }

    private By loginButton(){
        return By.xpath("//span[text()='Masuk']");
    }

    @Step
    public void onLoginPage(){
        $(titleLoginPage()).isDisplayed();
    }

    @Step
    public void inputValidEmail(String email){
        $(emailField()).type(email);
    }

    @Step
    public void clickNext(){
        $(nextButton()).click();
    }

    @Step
    public void inputValidPassword(String password){
        $(passwordField()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }
}
