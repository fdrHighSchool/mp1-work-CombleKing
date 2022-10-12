import java.util.Random;
import java.util.Scanner;

public class rng { 

   public static void main(String[] args) { 

    Scanner scanner = new Scanner(System.in); 
    System.out.println("  ______________________________________");
    System.out.println(" |   [Please choose the difficulty.]    |");
    System.out.println(" |   [Easy]  [Medium]  [Hard]  [Why]    |");
    System.out.println(" |______________________________________|");
    String mode = scanner.nextLine();

if (mode.equalsIgnoreCase("easy")){
    ez();
}
else if (mode.equalsIgnoreCase("medium")){
    medium();
}
else if (mode.equalsIgnoreCase("hard")){
    hard();
}
else if (mode.equalsIgnoreCase("why")){
    why();
}
else{
    System.out.println("Please enter a difficulty or make sure you spelt it correctly.");
}

   }//end of main method

public static void ez() {
    int difference;
     Scanner scanner = new Scanner(System.in); 
     int number = (int)(Math.random()* 50) + 1; // generates a random number between 1 - 50
     System.out.println("I have a number between 1-50, Can you guess what it is?");
     int userIntGuess = scanner.nextInt(); // takes user input in the terminal
     if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
 System.out.println("Congratulations! The Number that I was thinking of is: " + number);
 
     } else {
          difference = Math.abs(number - userIntGuess);
          System.out.println("The number that I was thinking of was " + number);
          System.out.println("You were off by " + difference + ", how did you get it wrong?");
     }
    }




public static void medium() {
    int difference;
    Scanner scanner = new Scanner(System.in); 
    int number = (int)(Math.random()* 100) + 1; // generates a random number between 1 - 100
    System.out.println("I have a number between 1-100, Can you guess what it is?");
    int userIntGuess = scanner.nextInt(); // takes user input in the terminal
    if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
System.out.println("Congratulations! The Number that I was thinking of is: " + number);

    } else {
         difference = Math.abs(number - userIntGuess);
         System.out.println("The number that I was thinking of was " + number);
         System.out.println("You were off by " + difference + ", try again next time!");
      }
}



public static void hard() {
    int difference; 
    Scanner scanner = new Scanner(System.in); 
    int number = (int)(Math.random()* 200) + 1; // generates a random number between 1 - 200
    System.out.println("I have a number between 1-200, Can you guess what it is?");
    int userIntGuess = scanner.nextInt(); // takes user input in the terminal
    if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
System.out.println("Congratulations! The Number that I was thinking of is: " + number);

    } else {
         difference = Math.abs(number - userIntGuess);
         System.out.println("The number that I was thinking of was " + number);
         System.out.println("You were off by " + difference + ", try again next time!");
      }
}


public static void why() {
    int difference;
    Scanner scanner = new Scanner(System.in); 
    int number = (int)(Math.random()* 300) + 1; // generates a random number between 1 - 100
    System.out.println("I have a number between 1-300, Can you guess what it is?");
    int userIntGuess = scanner.nextInt(); // takes user input in the terminal
    if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
System.out.println("How did you know the number was: " + number);

    } else {
         difference = Math.abs(number - userIntGuess);
         System.out.println("The number that I was thinking of was " + number);
         System.out.println("You were off by " + difference + ", try again next time!");
        }
    }
}// end of class
