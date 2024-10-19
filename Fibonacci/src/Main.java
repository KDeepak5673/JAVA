import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number to get fibonacci : ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;

        int sum = 0;

        for(int i=1 ; i<=num ; i++){
            sum = a+b;
            b = a ;
            a = sum;
        }
        System.out.println(sum);

    }
}