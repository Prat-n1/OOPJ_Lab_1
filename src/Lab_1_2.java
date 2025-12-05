import java.util.*;

class QuadraticRoots {
    public static void main(String[] args) {
        System.out.print("Enter Values of Coefficients starting from x2:");
        int a,b,c;
        float sq;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int d=a*c;
        sq = (float) Math.sqrt((b*b)-4*a*c);
        float r1 = (-b+sq)/(2*a);
        float r2 = (-b-sq)/(2*a);

        System.out.println("Root of Coefficients is "+r1+","+r2);

    }
}