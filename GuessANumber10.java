package sstable;
}
import java.util.Random;
import java.util.Scanner;

public class GuessANumber10 {

    private static Scanner sc;

    public static void main(String args[]) {

        int playCount = 0;
        sc = new Scanner(System.in);
        Random rand = new Random();

        
        System.out.print("would you like to play? (y/n) ");
        String response = sc.next();

        while (response.equals("y")) {
            playCount++;

            int  num = rand.nextInt(100) + 1;   
            System.out.println(num);
         
            System.out.print("Guess between 0 and 100: ");
            int guess = sc.nextInt();

            while (guess != num) {

                if (guess <= num) {
                    System.out.println("too low, guess again: ");
                    guess = sc.nextInt();
                }  else {
                    System.out.println("too high, guess again: ");
                    guess = sc.nextInt();
                } 
            }
            
            System.out.println("you got it");
            System.out.println("you have played " + playCount + " times");
            System.out.println("would you like to play again? (y/n) ");
            response = sc.next();

        }

    }
}