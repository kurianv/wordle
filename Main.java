import java.util.*;
public class Main {

    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        //asks the user to play
        System.out.println("Are you ready to play? Type true to continue or else type false.");
        boolean playAgain = input.nextBoolean();

        while(playAgain){ //plays if true - loop runs until false
            Tools.cleanBoard(); //clean the board
            Game.startGame();//starts the game
            
            //play again
            System.out.println("Do you want to play again? Type true to play again or else type false.");
            playAgain = input.nextBoolean();
            Tools.cleanBoard(); //clean the board
            
        }
        if (playAgain == false){
            System.out.println("Good Bye. See you later.");
        }
    }
}
