import java.util.*;
import java.math.*;

class SumDigits {
    public static void main(String[] args) {
        System.out.print("Enter a 3 digit number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=n%10;
        n=n/10;
        int b=n%10;
        n=n/10;
        int c=n%10;
        int d=a+b+c;

        System.out.println("The sum of the digits = "+d);

    }
}