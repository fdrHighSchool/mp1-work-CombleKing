import java.util.Scanner;//adds a scanner for user imput

public class date{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);// makes a scanner object

        System.out.println("Enter the day of the week.");
        String day = s.nextLine();// reads the user input for the day of the week and stores it

        System.out.print("Enter the month: ");
        String month = s.nextLine();// reads the user input for the month and stores it 

        System.out.println("Enter the year: ");
        String year = s.nextLine();// reads the input for year and stores it

        System.out.println("Enter the day of the month: ");
        String dayomonth = s.nextLine();// reads and stores input for day of the month

        System.out.println("American Format: " + day + ", " + month + " " + dayomonth + ", " + year);// prints everything on 1 line
        System.out.println("European Format: " + day + " " + dayomonth + " " + month + " " + year);// prints everything on 1 line
        s.close();
    }
}