package org.example.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\oscar\\IdeaProjects\\Cucumber_one\\src\\main\\resources\\features"
        ,glue = "org.example.stepdefs",
        tags = "automation" ,
        plugin = {"pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml"
                ,"rerun:target/rerun.txt"

        }
)








public class runner extends AbstractTestNGCucumberTests {
}
