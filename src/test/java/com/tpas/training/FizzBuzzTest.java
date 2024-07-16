package com.tpas.training;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // Path to your feature files
        glue = "com.tpas.training"       // Package where step definitions are located
)
public class FizzBuzzTest {
}
