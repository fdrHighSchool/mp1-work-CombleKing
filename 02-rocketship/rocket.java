// Name: Alex P, YuXin Li
//Period 5
//9.23.22

public class rocket{
    public static void main(String[]args){
        triangle();
        body();
        bodyUS();
        body();
        triangle();
    }

    public static void triangle() {
        System.out.println("   /\\");
        System.out.println("  /  \\");
        System.out.println(" /    \\");
    }

    public static void leveler(){
    System.out.println("+------+");
    }

    public static void body() {
        leveler();
        System.out.println("|      |");
        System.out.println("|      |");
        leveler();
    }

    public static void bodyUS() {
        System.out.println("|United|");
        System.out.println("|States|");
    }
}