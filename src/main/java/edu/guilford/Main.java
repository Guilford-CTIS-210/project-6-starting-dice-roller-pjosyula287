package edu.guilford;
import java.util.Random;
import java.util.Scanner;
//Pranavi Josyula
//9-24-24
public class Main {
     
    public static void main(String[] args) {

        // default for loop, prints loop variable as it counts up
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("You are going to be rolling ten dice, and I'll total the rolls. How many sides should the dice have?");
        int sides = scan.nextInt(); //stores desired number of sides
        Scanner myScan = new Scanner(System.in);
        System.out.println("How many dice do you want to roll?");
        int number = myScan.nextInt(); //stores desired number of dice
        int sum = 0;

        for (int i = 0; i < number; i++) {//initialization, bound, and adding one every time
            int diceRoll = rand.nextInt(1,sides+1); //takes into account number of sides user wants
            sum += diceRoll;
            //System.out.println("Sum of " + i + "d" + sides + " = " + sum); //commented out because we don't want multiple outputs
        }
        System.out.println(number + "d" + sides + "=" + sum); //gives final result
    }
   
}