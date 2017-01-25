import java.util.Random;
import java.util.Scanner;

/******************************************************************************
 * Name: Jonah Rubin, Aileen Wu
 * Date: 1/25/17  
 * Teacher: Elia
 * Period: 8 - Algorithms and Data Structures
 *
 * Description:
 * Guess a number 0-100
 *
 * OUTPUT:
 * would you like to play? (y/n) y
 * Guess between 0 and 100: 50
 * too high, guess again: 25
 * too high, guess again: 15
 * too high, guess again: 10
 * too high, guess again: 5
 * too low, guess again: 7
 * too low, guess again: 8
 * you got it
 * you have played 1 time(s)
 * would you like to play again? (y/n) n
 *
 *
 ******************************************************************************/

public class GuessANumber10 {

    private static Scanner sc;

    public static void main(String args[]) {

        int playCount = 0;
        sc = new Scanner(System.in);
        Random rand = new Random();

        
        System.out.print("would you like to play? (y/n) ");
        String response = sc.next();

        while (response.equals("y")) {
            int  num = rand.nextInt(100) + 1;   
            System.out.print(num);
            
            System.out.print("Guess between 0 and 100: ");
            int guess = sc.nextInt();
            playCount++;


            while (guess != num) {

                if (guess <= num) {
                    System.out.print("too low, guess again: ");
                    guess = sc.nextInt();
                    playCount++;

                }  else {
                    System.out.print("too high, guess again: ");
                    guess = sc.nextInt();
                    playCount++;
                } 
            }
            
            System.out.println("you got it");
            System.out.println("it took " + playCount + " guess(es)");
            playCount = 0;
            System.out.print("would you like to play again? (y/n) ");
            response = sc.next();
            

        }

    }
}
