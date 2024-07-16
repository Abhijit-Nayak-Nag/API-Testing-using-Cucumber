package com.tpas.training;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    private FizzBuzz fizzBuzz;
    private String result;

    @Given("Create a FizzBuzz game play")
    public void create_a_fizz_buzz_game_play() {
        fizzBuzz = new FizzBuzz();
    }

    @When("I play with number {int}")
    public void i_play_with_number(Integer number) {
        result = fizzBuzz.play(number);
    }

    @Then("The result is Fizz")
    public void the_result_is_fizz() {
        Assert.assertEquals("Fizz", result);
    }

    @Then("The result is Buzz")
    public void the_result_is_buzz() {
        Assert.assertEquals("Buzz", result);
    }
}
