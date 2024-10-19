import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner Number = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = Number.nextInt();
        System.out.print("Enter second Number : ");
        int b = Number.nextInt();
        int sum = a + b ;
        System.out.print("sum of two numbers is : "+sum);
    }
}