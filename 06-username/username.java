import java.util.Scanner;

public class username {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    
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

    System.out.println(genpass());


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

  public static String genpass() {
    String pass = "";
    Scanner s = new Scanner(System.in);
    System.out.println("enter you password length.");
    int length = s.nextInt();
  
      for (int i = 0; i<length;i++){
        
        int cap = (int)(Math.random()*(90-64+1)+64);
        int lower = (int)(Math.random()*(122 -97 +1) +97);
        int num = (int)(Math.random()*(57-33+1) + 33);
  
  
        char upper = (char)cap;
        char lowerc = (char)lower;
        char numberspec = (char)num;
       
  
        pass += lowerc;
        pass += upper;
        pass += numberspec;
      
          
  
      
  }


  pass =pass.substring(0,length);
  s.close();
  return pass;
  }




} // end class


//import a scannner
///process: 1) random # 65-90 cap letter
//97-122 lower case
//33-47 special symbols
//have # conver to character via c= (char)i
//add to a string and retunr the password



