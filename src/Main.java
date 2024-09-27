import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int age = 0;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        if (in.hasNextInt()) {
            age = in.nextInt();
            in.nextLine();
        }

        if (age >= 21) {
            System.out.println("You get a wristband!");
        } else {
            System.out.println("You are not 21, you do not get a wristband.");
        }
    }
}