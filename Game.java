import java.util.*;

public class Game {
    private static Scanner input;
    
    public static void startGame() throws Exception{
        //instruction
        String instruction = "Instruction: \n1. You have six tries to guess the five-letter Wordle of the day. \n2. Type in your guess and submit your word by hitting the enter key on the Wordle keyboard. \n3. Filled spots on the lines indicated that the character in the entered word had matching character in the same position, \n if a character was in the word, a prompt will be displayed tell that the character is in the word but is at the \n wrong position. \n4. Continue until you solve the Wordle or run out of guesses. Good luck! \n";
        System.out.println(instruction);
        input = new Scanner(System.in);
        
        String selectedWord = Words.randomWord();//random word selection from the Word class
        Tools.printBoard(); //prints the blank board
        int count = 0;
        for(int i = 0; i < 6; i++){// runs the game 6 times
            System.out.print("Enter your 5 letter word: ");
            String userWord = input.nextLine();

            // condition to check if the user word and the selected word is the same
            if (userWord.toUpperCase().equals(selectedWord.toUpperCase())){
                System.out.println("Good Job!! You found the Worlde: " + selectedWord.toUpperCase());
                System.out.println("______________________________________________________");
                System.out.println();
                break; // ends the game 
            }

            //then user word and selected word is used as parameter to check the letter in the selected word
            Tools.checker(userWord, selectedWord);
            count++;

            
        }
        //exits the game it is cross for than six games
        if (count == 6){
            System.out.println("You LOST!! The Worlde was " + selectedWord);
            System.out.println("______________________________________________________");
            System.out.println();
        }
        
        
    }
}
