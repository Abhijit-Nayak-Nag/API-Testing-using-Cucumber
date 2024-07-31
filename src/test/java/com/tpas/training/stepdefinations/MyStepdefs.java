package com.tpas.training.stepdefinations;

import com.tpas.training.FizzBuzz;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MyStepdefs {

    //  FizzBuzz fizzBuzz= new FizzBuzz(); // you can directly create like this or else you can

    private FizzBuzz fizzBuzz;

     /*When you declare a field in a class,
     you are not automatically creating an object; you are merely creating a reference that can point to an object.
     This line declares a field named fizzBuzz of type FizzBuzz. At this point, fizzBuzz is just a reference, and it
     doesn't point to any actual FizzBuzz object. It's like saying you have a variable that can hold a FizzBuzz object,
     but you haven't created or assigned any object to it yet.*/
    private String result;

    @Given("Create a FizzBuzz game play")
    public void create_a_fizz_buzz_game_play() {
         fizzBuzz = new FizzBuzz(); //This line creates a new instance of the FizzBuzz class and assigns it to the
        // fizzBuzz field. Now, fizzBuzz is a reference that points to an actual FizzBuzz object.
    }

    @When("I play with number {int}")
    public void i_play_with_number(Integer number) {
        result = fizzBuzz.play(number);
        System.out.println(number);
        System.out.println(result);
    }


    @When("I play with the number {int}")
    public void i_play_with_the_number(Integer int1) {
        result= fizzBuzz.play(int1);
        System.out.println(int1);
        System.out.println(result);
    }


    @Then("The result is Fizz")
    public void the_result_is_fizz() {
        Assert.assertEquals("Fizz", result);
        System.out.println(result);
    }

    @Then("The result is {string}")
    public void the_result_is_buzz(String str) {
        Assert.assertEquals(str, result);
        System.out.println(result);

    }
}



