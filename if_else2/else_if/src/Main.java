import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("*****Finding which is greater*****");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        if(a==b) {
            System.out.print("Equal");
        } else if(a>b) {
                System.out.print("a is greater.");
            } else {
                System.out.print("b is greater.");
            }
    }
}