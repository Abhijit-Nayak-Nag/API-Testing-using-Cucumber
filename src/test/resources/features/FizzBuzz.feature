Feature: Play FizzBuzz

  Scenario: Play FizzBuzz to get Fizz
    Given Create a FizzBuzz game play
    When I play with number 3
    Then The result is Fizz

  Scenario: Play FizzBuzz to get Buzz
    Given Create a FizzBuzz game play
    When I play with the number 5
    Then The result is "Buzz"
