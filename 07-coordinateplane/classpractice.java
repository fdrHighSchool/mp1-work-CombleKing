public class classpractice {
    public static void main(String[]args){
        System.out.println(eucdistance(0, 0,3, 4));
        System.out.println(taxdistance(0, 0, 3, 4));
        System.out.println(circarea(3));
        System.out.println(cylarea(3, 2));
        System.out.println(triarea(4, 3, 6));

    }
public static double eucdistance(int x1, int y1, int x2, int y2){
    double distance;
    
  distance = Math.sqrt( Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
  return distance;
}
public static double taxdistance(int x1, int y1, int x2, int y2){
    double distance;
    distance = Math.abs(x2-x1) + Math.abs(y2-y1);
    return distance;
  }
public static double circarea(int r){
    double area;
    area = (Math.PI * Math.pow(r, 2));
    return area;
}
public static double cylarea(int r , int h){
    double area;
    area = 2*circarea(r) + 2*Math.PI*r*h;
    return area;
}
public static double triarea(int a, int b, int c){
    double area;
    double s;
    s = (a + b + c)/2.0;
    area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return area;
}
}




