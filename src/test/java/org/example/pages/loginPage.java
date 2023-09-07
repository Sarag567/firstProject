package org.example.pages;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static  org.example.stepdefs.hooks.driver;
public class loginPage{
    public loginPage(){
        PageFactory.initElements(driver,this);
    }
   @FindBy(className = "ico-login")
    public WebElement loginbutton;




@FindBy(id = "Email")
    public WebElement email;
@FindBy(id = "Password")
    public WebElement password;
//@FindBy(className = "")
   // public WebElement select;
    @FindBy(css = "[class=\"button-1 login-button\"]")
    public WebElement button;
}
