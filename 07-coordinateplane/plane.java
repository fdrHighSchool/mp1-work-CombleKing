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
    System.out.println(checkquad(cord1) + " For your first coordinate.");
    System.out.println(checkquad(cord2) + " For your second coordinate.");
    System.out.println("Your Euclidean distance is " + eucdistance(getX(cord1), getY(cord1), getX(cord2), getY(cord2)));
    System.out.println(taxdistance(getX(cord1), getY(cord1), getX(cord2), getY(cord2)));

    s.close();
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
  
  public static String checkquad( String x){
      String quad ="";

      if (getX(x) > 0 && getY(x) > 0){
              quad = "Your coordinate is in Quadrant 1.";
      }
      else if(getX(x) > 0 && getY(x) < 0){
        quad = "Your coordinate is in Quadrant 4.";
      }
      else if(getX(x)<0 && getY(x)> 0){
      quad ="Your coordinate is in Quadrant 2.";
      }
      else if(getX(x)>0 && getY(x)>0){
        quad = " Your coordinate is in Quadrant 3.";
      }
       else{
        quad = "Your coordinate is not in a Quadrant.";
    }
      return quad;
  }

  /*
   * N: euclideanDistance
   * P: calculate the distance between two points
   * sqrt((x2 - x1)^2 + (y2 - y1)^2)
   * I:
   * R:
   */

  public static double eucdistance(int x1, int y1, int x2, int y2){
      double distance;
      
    distance = Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
    return distance;
  }
  /*
   * N: taxicabDistance
   * P: calculate the distance between two points
   * abs(x2 - x1) + abs(y2 - y1)
   * I:
   * R:
   */

public static double taxdistance(int x1, int y1, int x2, int y2){
  double distance;

  distance = Math.abs(x2-x1) + Math.abs(y2-y1);
  return distance;
}

} // end class
