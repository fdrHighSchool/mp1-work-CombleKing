import java.util.Scanner;

public class username {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);
    // get String input from user

    System.out.print("Are you a teacher or student?");
    String role = s.nextLine();
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    firstName = firstName.toLowerCase();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    lastName =lastName.toLowerCase();
    System.out.print("Enter your favorite number: ");
    int number = s.nextInt();


  if (role.equalsIgnoreCase("student")){
    //student email
    System.out.println("Hello, " + firstName + initialize(lastName) + number + "@nycstudents.net");
  }

  else if (role.equalsIgnoreCase("teacher")){
  //teacher email
    System.out.println("Hello, " + initialize(firstName)  + lastName + number + "@schools.nyc.gov");
  }

  else {
      System.out.println("Please spell student or teacher correctly.");
  }



    s.close();
  } // end main method
  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
  public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method

} // end class