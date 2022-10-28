import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

public class plane {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String cord1, cord2;
    boolean status;

    // check if the user input the point correctly
    // if yes, continue code
    // if no, get the input again
    do{
      System.out.print("Please enter a point in the form (x, y): ");
    // write a statement to store the input
    cord1 = s.nextLine();
    status = check(cord1);
    }
    while(status != true);
   
    // write a statement to store the input

    // check if the user input the point correctly
    // if yes, continue code
    // if no, get the input again
  
    do{
      System.out.print("Please enter a second point in the form (x, y): ");
    // write a statement to store the input
    cord2 = s.nextLine();
    status = check(cord2);
    }
    while(status != true);

    System.out.println(getX(cord2) + " " +getY(cord2));
    System.out.println(getX(cord1) +" "+ getY(cord1));
    // test your methods below:

  } // end main method

  /*
   * N: checkInput
   * P: determine whether or not the input followed correct format
   * I: String user typed in
   * R: ???
   */
public static boolean check(String p) {

    boolean input = true;
    if (p.indexOf("(") != 0){
        input = false; 
      }
    
    if (p.indexOf(", ") == -1){
        input = false;
    }

    if(p.indexOf(")") !=  p.length() - 1){
        input = false;
    }
  
        return input;
}

  /*
   * N: getX
   * P: get the x-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: x-coordinate (int)
   */
  public static int getX(String point) {
    // determine where the comma is located
    int commaPos = point.indexOf(",");
    // grab substring from after parentesis up to comma
    String x = point.substring(1, commaPos);
    // return value back to main so it can be used later in the program
    return Integer.parseInt(x);
  } // end getX method

  /*
   * N: getY
   * P: get the y-coordinate of the point
   * I: coordinate in the form (x, y) (String)
   * R: y-coordinate (int)
   */
  public static int getY(String point) {
    // determine where the space is located
    int spacepos = point.indexOf(" ");
    // grab substring from after parentesis up to comma
    String y = point.substring(spacepos + 1, point.length()-1);
    // return value back to main so it can be used later in the program
    return Integer.parseInt(y);
  }


  /*
   * N: quadrant
   * P: determine which quadrant the point lies in
   * I: take the cordinates and compare the x and y cords for negativity. 
   * R: integer of the quadrant
   */


  /*
   * N: euclideanDistance
   * P: calculate the distance between two points
   * sqrt((x2 - x1)^2 + (y2 - y1)^2)
   * I:
   * R:
   */

  /*
   * N: taxicabDistance
   * P: calculate the distance between two points
   * abs(x2 - x1) + abs(y2 - y1)
   * I:
   * R:
   */

} // end class
