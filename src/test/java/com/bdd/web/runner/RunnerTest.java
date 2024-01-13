package com.bdd.web.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
    @CucumberOptions(
            plugin = {"pretty","html:target/site/serenity/index.html","json:target/site/serenity.json"},
            features = {"src/test/resources/features"},
            glue = {"com/bdd/web/stepdefinitions"},
            stepNotifications = true,
            tags = "@AUTOMATIZACION_SAUCEDEMO"
    )

    public class RunnerTest {
        @BeforeClass
        public static void beforeExecution(){

        }

        @AfterClass
        public static void afterExecution(){

        }
    }


