/*Ethan  McCarthy 
Assignment J6
Comp Sci 120
4/5/22*/
import java.io.*;
class GuessingGame{
    public static void main(String[] args) throws IOException{
        InputStreamReader inStream = new InputStreamReader(System.in);
        BufferedReader stdin = new BufferedReader(inStream);
        String inData;
        int player1, player2, guesses;
        guesses = 1;//initializes the guesses variable
        System.out.println("Welcome to Striker-a guessing game!");
        System.out.println("Player one enter a posititve integer under 1000.");
        inData = stdin.readLine();
        player1 = Integer.parseInt(inData);//player1 number
        System.out.println("Player two guess a number: ");
        inData = stdin.readLine();
        player2 = Integer.parseInt(inData);//player2 first guess
        while (player1 != player2) {//when player2 doesnt guess the number 
            if (player2 < player1) {
                System.out.println("Your guess is too low! Try a higher number.");//guess too high
            }
            if (player2 > player1) {
                System.out.println("Your guess is too high! Try a lower number.");//guess too low
            }
            inData = stdin.readLine();
            player2 = Integer.parseInt(inData);//player2 gets another guess
            guesses++;//increases the guesses by 1
        }
        if (player1 == player2) {//player 2 wins
            System.out.println("Congratulations, you guessed it!");
            System.out.println("It took you " + guesses + " guesses to determine the number.");
        }
        System.out.println("Thank you for playing Striker.");//thank you message

    }
}