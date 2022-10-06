import java.util.Random;
import java.util.Scanner;

public class rng { 

   public static void main(String[] args) { 
      int difference;
      Random random = new Random(); 
      Scanner scanner = new Scanner(System.in); 
      int number = random.nextInt(100) + 1; // generates a random number between 1 - 100
      System.out.println("I have a number between 1-100, Can you guess what it is?");
      int userIntGuess = scanner.nextInt(); // takes user input in the terminal

      if (number == userIntGuess) { // check if the user's chosen number is equal to the randomly generated number
System.out.println("Congratulations! The Number that I was thinking of is: " + number);

      } else {
         difference = Math.abs(number - userIntGuess);
         System.out.println("The number that I was thinking of was " + number);
         System.out.println("You were off by " + difference + ", try again next time!");
      }
   }//end of main method
}// end of class