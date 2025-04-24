package GuessingGame;

import java.util.Scanner;

public class GuessingGame {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int userGuess = 0;

        int guessNumber = 7;

        while (userGuess != guessNumber) {

            System.out.println("Guess a nuber between 1-10");
            userGuess = sc.nextInt();
        }

        if( userGuess == guessNumber){
            System.out.println("You did it!");
        }
        sc.close();

        
    }
}
