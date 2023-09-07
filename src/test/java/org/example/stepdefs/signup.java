package org.example.stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.HomePage;
import org.example.pages.Regester_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import static org.example.stepdefs.hooks.driver;
import static org.openqa.selenium.By.*;

public class signup {
//    @Given("step one open chromeBrowser and navigate to the \"https://demo.nopcommerce.com/\"")
//    public void Open(){
//
//}
    public static String email;
    public static String password;
HomePage homePage=new HomePage();
Regester_Page register =new Regester_Page();


    @And("step two click to register bottom and go to register page")
    public void stepTwoClickToRegisterBottomAndGoToRegisterPage() {
        homePage.registerButton().click();
    }

    @When("step three  user reach to registration page choose  gender")
    public void stepThreeUserReachToRegistrationPageChooseGender() {
       // driver.findElement(By.id("gender-female")).click();
Regester_Page.gender.click();


    }



    @And("step four user enter first and last name")
    public void stepFourUserEnterFirstAndLastName() {
        register.firstname.sendKeys("alaa");
register.lastname.sendKeys("gamal");


    }

    @And("step six user enter date of birth")
    public void stepSixUserEnterDateOfBirth() {

       // WebElement element=driver.findElement(By.name("DateOfBirthDay"));
        Select select=new Select(register.dateDay);
        select.selectByIndex(4);
       // WebElement elemntMonth=driver.findElement(By.name("DateOfBirthMonth"));
        Select selectTwo=new Select(register.dateMonth);
        selectTwo.selectByIndex(10);
     //   WebElement elemntYear=driver.findElement(By.name("DateOfBirthYear"));
        Select selectThree=new Select(register.year);
        selectThree.selectByIndex(20);

    }

//    @And("step seven user enter email")
//    public void stepSevenUserEnterEmail() {
//        driver.findElement(By.id("Email")).sendKeys("aya@gmail.com");
//
//
//    }

    @And("step eight enter company name and click to newsletter")
    public void stepEightEnterCompanyNameAndClickToNewsletter() {
        register.company.sendKeys("ahram");
        register.newsletter.click();
    }

    @And("step nine enter password and confirm password")
    public void stepNineEnterPasswordAndConfirmPassword() {
        password="12345678";
        register.pass.sendKeys(password);
        register.confirm.sendKeys(password);
    }

    @And("step ten click to register button")
    public void stepTenClickToRegisterButton() {
        register.button.click();
    }

    @Then("user create a new account")
    public void userCreateANewAccount() {
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(register.result.getText(),"Your registration completed");
        soft.assertEquals(register.result.getCssValue("color"),"rgba(76, 177, 124, 1)");
  //  soft.assertAll();
        }

    @And("step seven user enter email{string}")
    public void stepSevenUserEnterEmail(String arg0) {
        Faker faker=new Faker();
    email=    faker.internet().emailAddress();
        register.email.sendKeys(email);

    }

    @And("step seven user enter invalid email")
    public void stepSevenUserEnterInvalidEmail() {
        Faker faker=new Faker();
     String   arg0=    faker.name().firstName();
        driver.findElement(id("Email")).sendKeys(arg0+".com");
    }

    @Then("the account isnot created")
    public void theAccountIsnotCreated() {
        SoftAssert softOne=new SoftAssert();
       String value= register.rege_rror.getText();
       softOne.assertEquals(value.toLowerCase(),"error email");

    }
}
