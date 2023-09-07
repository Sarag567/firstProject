package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stepdefs.hooks.driver;

public class HomePage {
public WebElement registerButton() {


    return  driver.findElement(By.className("ico-register"));
}
public HomePage(){
    PageFactory.initElements(driver,this);
}


}
