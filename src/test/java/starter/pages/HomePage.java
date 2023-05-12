package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By titleHomePage(){
        return By.xpath("//*[@id=\"header-main-wrapper\"]/div[2]/a/img");
    }

    private By login(){
        return By.xpath("//button[text()='Masuk']");
    }

    @Step
    public void onHomePage(){
        open();
        $(titleHomePage()).isDisplayed();
    }

    @Step
    public void clickLogin(){
        $(login()).click();
    }

    @Step
    public void onHomePageSuccessfully(){
        System.out.println("On Home Page Successfully");
    }
}
