# Guessing Game - Java

## Introduction
This is a simple command-line number guessing game written in Java. The program generates a random number between **1 and 10**, and the user has **three attempts** to guess it correctly. If the user guesses the number correctly within the allowed attempts, they win the game; otherwise, the correct number is revealed after three unsuccessful attempts.

## Features
- Random number generation between **1 and 10**.
- **Game menu** to start a new game or exit.
- **Input validation** to ensure users enter a valid numeric guess.
- **Error handling** to catch invalid input types (e.g., non-numeric values).
- Provides feedback on whether the guessed number is too high, too low, or correct.
- Limits the number of attempts to **three**.

## How to Run the Program

### Prerequisites
Ensure you have the following installed:
- **Java Development Kit (JDK)** (Version 8 or later)
- A command-line terminal (Command Prompt, Bash, or any terminal supporting Java execution)

### Steps to Run
1. **Clone this repository** or **download the Main.java file**.
2. Open a terminal and navigate to the directory where `Main.java` is stored.
3. Compile the Java program:
   ```sh
   javac Main.java
   ```
4. Run the compiled program:
   ```sh
   java Main
   ```
5. Follow the on-screen instructions to play the game.

## How to Play
- After running the program, a menu will appear.
- Enter `1` to start a new game or `2` to exit.
- If you start the game, enter a number between **1 and 10** when prompted.
- The program will provide hints ("too high" or "too low") if the guess is incorrect.
- You have **three attempts** to guess the correct number.
- After three incorrect attempts, the correct number is revealed, and you can choose to restart or exit.

## Example Output
```
==============================================================================================
                Hello Welcome to the Guessing game.

                MENU
                1. Start new game.
                2. Exit.

Your choice: 1
==============================================================================================
Enter your numeric guess [1-10]: 5
Your number 5 is too low.
Try again!
==============================================================================================
Enter your numeric guess [1-10]: 8
Your number 8 is too high.
Try again!
==============================================================================================
Enter your numeric guess [1-10]: 7
Congratulations! You have won the game! The correct number is: 7
```

## Error Handling
- If a non-numeric value is entered, the program displays an error message and prompts for a valid number.
- If the user enters a number outside the range (1-10), an error message is shown.

## Exit the Game
- Choose option `2` from the menu to exit the program.
- The program will display `Exiting... Goodbye!` before terminating.

## License
This project is open-source and available for modification and distribution.

---
Enjoy the game! 🎮

## AUTHOR
- Jamespeter murithi