import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("****** Use of switch ******");
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose button : ");

        int button = sc.nextInt();

        switch (button){
            case 1 : System.out.print("Hello");
            break;
            case 2 : System.out.print("Namaste");
            break;
            case 3 : System.out.print("Bonjour");
            break;
            default: System.out.print("Invalid button");
        }
    }
}