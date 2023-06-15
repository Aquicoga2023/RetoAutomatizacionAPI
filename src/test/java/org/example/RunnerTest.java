package org.example;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features/Demoblaze.feature"},
        glue = {"com.examples.cucumber"})
public class RunnerTest {

}