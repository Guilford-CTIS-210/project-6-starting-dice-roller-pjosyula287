package edu.guilford;
import java.util.Random;
import java.util.Scanner;

public class Main {
     Random rand = new Random();
    public static void main(String[] args) {

        // default for loop, prints loop variable as it counts up
        Scanner scan = new Scanner(System.in);
        System.out.println("You are going to be rolling ten dice. How many sides should the dice have?");
        int sides = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int diceRoll = 0;
            sum += diceRoll;
            System.out.println("Sum of " + i + "d" + sides + " = " + sum);
        }
    }
}