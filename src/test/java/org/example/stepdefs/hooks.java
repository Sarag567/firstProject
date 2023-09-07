package org.example.stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class hooks {
   public  static WebDriver driver;
    @Before
    public void OpenBrowser() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void QuitBrowser() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();

    }






}
