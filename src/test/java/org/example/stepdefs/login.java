package org.example.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.loginPage;
import org.testng.asserts.SoftAssert;

import static org.example.stepdefs.hooks.driver;

public class login {
    loginPage login=new loginPage();
    @Given("user go to login page")
public void usercangotologinpage(){
    login.loginbutton.click();

}

    @And("user enter valid email and password")
    public void userEnterValidEmailAndPassword() {
        login.email.sendKeys("saraGamal@gmail.com");
        //login.email.sendKeys(signup.email);
//login.password.sendKeys(signup.password);
login.password.sendKeys("12345678");
    }

    @And("click to login button")
    public void clickToLoginButton() {
        login.button.click();



    }

    @And("user can go to profile page")
    public void userCanGoToProfilePage() {
        SoftAssert softAssert=new SoftAssert();
        String result=driver.getCurrentUrl();
        softAssert.assertEquals(result,"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
    }

    @And("select remember chick box")
    public void selectRememberChickBox() {
    }

    @Then("user can log in to the website")
    public void userCanLogInToTheWebsite() {
    }
}
