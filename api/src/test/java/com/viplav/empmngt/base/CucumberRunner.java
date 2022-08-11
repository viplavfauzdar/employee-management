package com.viplav.empmngt.base;

import com.viplav.empmngt.EmpmngtApplication;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//don't need this because it's in build.gradle
/*@CucumberOptions(features = {"src/test/resources/features"},
                        //glue= {"stepDef"},
                        plugin = {"pretty", "json:build/cucumber-reports/Cucumber.json",
                            "junit:build/cucumber-reports/Cucumber.xml",
                            "html:build/cucumber-reports/Cucumber.html"})*/
@CucumberContextConfiguration
public class CucumberRunner {
}
