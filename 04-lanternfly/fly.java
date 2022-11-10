import java.util.Scanner;

public class fly{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");

        System.out.println("How many did you squash this summer? ");
        int num = input.nextInt();


        if(num <= 5){
            System.out.println("You either live away from everything or you let them bite you.");
        }
        else if (num <= 10) {
            System.out.println("You can do better than that!");
        }
        else if (num > 20){
            System.out.println("Do you live in the jungle!? ");
            System.out.println("Anyways, thank you for doing your job!");
        }
        else  {
            System.out.println("Please only enter numbers.");
        }
        input.close();
    }

}