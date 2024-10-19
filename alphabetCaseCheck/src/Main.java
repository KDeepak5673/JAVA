import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character : ");
        char st = in.next().trim().charAt(0);

        if (st > 'a' && st < 'z') {
            System.out.println("Lowercase");

        } else if (st > 'A' && st < 'Z') {
            System.out.println("Uppercase");
        } else {
            System.out.println("Wrong Input");
        }



    }
}