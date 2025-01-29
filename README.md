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
   ```bash
         java Main


   
