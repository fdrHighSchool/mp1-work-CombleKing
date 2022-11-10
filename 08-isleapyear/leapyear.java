import java.util.Scanner;


public class leapyear {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year to find our if it is a leap year: ");
        int year = s.nextInt();
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("Your year is a leap year.");
                }
                else{
                    System.out.println("Your year is not a leap year.");
                }
            }
            else{
                System.out.println("Your year is a leap year.");
            }
        }
        else{
            System.out.println("Your year is not a leap year.");
        }
        s.close();
    }
}
