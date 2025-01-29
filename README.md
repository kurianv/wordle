# WORDLE GAME
# Wordle Game in Java

This is a simple Wordle-like game implemented in Java. The game allows players to guess a five-letter word within six attempts. The game provides feedback on each guess, indicating which letters are correct and in the right position, and which letters are correct but in the wrong position.

## Files Overview

1. **Game.java**: Contains the main game logic, including the game loop and user interaction.
2. **Main.java**: The entry point of the application. It handles the game's initialization and allows the player to play multiple rounds.
3. **Tools.java**: Provides utility functions for checking the user's guesses, printing the game board, and cleaning the board between games.
4. **Words.java**: Handles reading the word list from a file (`wordle.txt`) and selecting a random word for the game.
5. **wordle.txt**: A text file containing a list of five-letter words used in the game.

## How to Play

1. **Start the Game**: Run the `Main.java` file. The game will prompt you to start by typing `TRUE` or `FALSE`.
2. **Game Instructions**: The game will display instructions on how to play. You have six attempts to guess the five-letter word.
3. **Enter Your Guess**: Type your five-letter guess and press Enter.
4. **Feedback**: The game will provide feedback on your guess:
   - Correct letters in the correct position will be displayed.
   - Correct letters in the wrong position will be indicated with a message.
5. **Win or Lose**: If you guess the word correctly within six attempts, you win. Otherwise, the game will reveal the correct word.

## Running the Game

1. Ensure you have Java installed on your system.
2. Compile the Java files:
   ```bash
   javac Main.java Game.java Tools.java Words.java
3. ```bash
         java Main

##Gameplay

Are you ready to play? Type TRUE to continue or FALSE.
TRUE
Instruction: 
1. You have six tries to guess the five-letter Wordle of the day. 
2. Type in your guess and submit your word by hitting the enter key on the Wordle keyboard. 
3. Filled spots on the lines indicated that the character in the entered word had matching character in the same position, 
 if a character was in the word, a prompt will be displayed tell that the character is in the word but is at the 
 wrong position. 
4. Continue until you solve the Wordle or run out of guesses. Good luck! 

 - - - - -
 - - - - -
 - - - - -
 - - - - -
 - - - - -
 - - - - -

Attempt 1:
The character C is in the word at the wrong position.
______________________________________________________

 - - - - -
 C - - - -
 - - - - -
 - - - - -
 - - - - -
 - - - - -

Attempt 2:
Enter your 5 letter word: ...

The game iterates until 6 attempts are met or if the word is guessed. After the game ends, the program asks if it would like to play another game.
