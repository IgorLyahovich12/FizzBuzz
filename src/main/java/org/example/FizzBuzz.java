package org.example;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz "); // The case is if it is a multiple of 3 and 5.
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz "); //For case  that are a multiple of 3, turn off  that are a multiple of 5.
            }
            else if (i % 5 == 0){
                System.out.println("Buzz ");//For case  that are a multiple of 5, turn off  that are a multiple of 3.
            }
            else{
                System.out.println(i + " ");
            }
        }
    }
}
