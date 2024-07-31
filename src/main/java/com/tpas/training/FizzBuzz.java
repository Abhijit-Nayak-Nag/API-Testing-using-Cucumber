package com.tpas.training;

public class FizzBuzz {
    public String play(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static void main(String[] args) {
        FizzBuzz f= new FizzBuzz();
        String res= f.play(3);
        System.out.println(res);
        System.out.println(f.play(3));
        System.out.println(f.play(5));
        System.out.println(f.play(4));
    }
}

