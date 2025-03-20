import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public int RandomNumber(){
        // defining an object of the class random
        Random rand_num = new Random();
        return rand_num.nextInt(10) + 1;  // the +1 shifts the range from 0-9 to 1 - 10
    }

    public static void main(String[] args) {

        // declaring variables
        boolean validity = true;
        int user_choice = 2;
        int user_number;
        int attempts = 0;

        // creating an object of the class
        Scanner user_input = new Scanner(System.in);
        Main sys_guess  = new Main();

        // Game menu
        while (validity) {
            try {
                System.out.println("==============================================================================================");
                System.out.println("\t\t\t  Hello Welcome to the Guessing game. \n");
                System.out.println("\t\tMENU");
                System.out.println("\t1. Start new game.");
                System.out.println("\t2. Exit. \n");
                System.out.print("Your choice : ");
                user_choice = user_input.nextInt();
                System.out.println("==============================================================================================");

                // checking if user input is in range
                if (user_choice > 0 && user_choice < 3) {
                    // System.out.println("Valid choice");
                    int sys_val = sys_guess.RandomNumber();

                    // utilizing Switch statement to handle user choice
                    switch (user_choice) {
                        case 1:
                        attempts = 0;
                            while (attempts < 3) {
                                try {
                                    System.out.print("Enter your numeric guess [1-10]: ");
                                    user_number = user_input.nextInt();
                                    if (user_number > 0 && user_number <= 10  ) {
                                        if (user_number > sys_val) {

                                            System.out.println("Your number " + user_number + " is too high.");
                                            System.out.println("Try again!");
                                            System.out.println("==============================================================================================");
                                        } else if(user_number < sys_val) {

                                            System.out.println("Your number " + user_number + " is too low.");
                                            System.out.println("Try again!");
                                            System.out.println("==============================================================================================");
                                            
                                        }
                                        else if (user_number == sys_val){
                                            System.out.println("==============================================================================================");
                                            System.out.println("Congratulations you have won the game!. Correct number is :  " + sys_val);
                                            attempts = 3;
                                        }
                            
                                        attempts ++;

                                        if (attempts == 3){
                                            System.out.println("Failed : Out of attempts the number is : " + sys_val);
                                            
                                        }
                                        
                                    } else {

                                        System.out.println("Error : Invalid input out of bound");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Error : Invalid input type! ");
                                    user_input.nextLine();
                                }
                            }
                            break;
                        
                        case 2 : 
                             System.out.println("Exiting .... Goodbye!");
                             validity = false;
                             user_input.close();
                            break;
                    }
                    
                } else {
                    System.out.println("Error  : Out of bound value!");
                }
                
            } catch (InputMismatchException e) {
                user_input.nextLine(); // clearing scanner class
                System.out.print("Error  : Invalid input type!");
                user_input.close();
            }
        }
    }
}