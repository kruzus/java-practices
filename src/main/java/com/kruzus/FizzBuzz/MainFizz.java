package com.kruzus.FizzBuzz;

public class MainFizz {

    public static void run(int number) {
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
            }

        }
    }
}
