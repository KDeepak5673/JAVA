import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = sc.nextInt();

        if(number%2 == 0){
            System.out.print("THis number is Even.");
        } else{
            System.out.print("This number is odd.");
        }
    }

}