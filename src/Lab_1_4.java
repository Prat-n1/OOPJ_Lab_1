import java.util.*;
import java.math.*;

class Area {
    public static void main(String[] args) {
        System.out.print("Enter 3 sides of a traingle : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = a+b+c;
        s=s/2;
        float d = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of a traingle is "+d);
    }
}