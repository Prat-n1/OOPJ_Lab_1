import java.util.*;
class UserDetails {
    public static void main(String[] args) {

        String name, branch, section, roll;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your branch: ");
        branch = sc.nextLine();
        System.out.print("Enter your section: ");
        section = sc.nextLine();
        System.out.print("Enter your roll: ");
        roll = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
        System.out.println("Roll: " + roll);
    }
}