package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefs.hooks.driver;

public class Regester_Page {
    public Regester_Page(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "gender-female")
    public static WebElement gender;

    @FindBy(id="FirstName")
    public static WebElement firstname;

    @FindBy(id = "LastName")
public WebElement lastname;
    @FindBy(name = "DateOfBirthDay")
    public WebElement dateDay;
    @FindBy(name = "DateOfBirthMonth")
    public WebElement dateMonth;
    @FindBy(name="DateOfBirthYear")
public WebElement year;
@FindBy (id = "Email")
public WebElement email;
@FindBy(id = "Company")
    public WebElement company;
@FindBy(id = "Newsletter")
    public WebElement newsletter;

@FindBy(id = "Password")
    public WebElement pass;

@FindBy(id = "ConfirmPassword")
    public WebElement confirm;
@FindBy(id = "register-button")
    public WebElement button;

@FindBy(className = "result")
public WebElement result;
@FindBy(id = "Email-error")
    public WebElement rege_rror;

}
