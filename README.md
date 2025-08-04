## Termo - Word Guessing Game in the Terminal

Termo is a simple word guessing game, inspired by the famous Wordle, to run in the terminal/console.
The goal is to guess the secret word in a limited number of tries. With each try, the game displays hints about the correct letters and their positions.

How to Play
Run the Java program (see below for how to compile and run).

Type a 5-letter word to try to guess the secret word.

The game will display correct letters in the correct position (usually highlighted) and correct letters in the wrong position.

Keep trying until you get it right or until you run out of tries.

------------------------------------------------------------------------------------------------
How to compile and run
In the terminal, inside the project folder:

javac src/br/com/natan/Termogame/*.java
java -cp src br.com.natan.Termogame.Termogame

Project Structure
src/br/com/natan/Termogame/
Java source code for the game

WordList.java — word list for the game (If you see the code and enter this folder and want to add more words, feel free, as long as it contains 5 letters.)

Termogame.java — main class that runs the game

InputHandler.java — user input handling

GameEngine.java — game logic

Utils.java — auxiliary functions
