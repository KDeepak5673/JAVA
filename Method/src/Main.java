import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int ans = sum2();
        System.out.println(ans);

    }

    static void sum() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = input.nextInt();

        System.out.println(num1+num2);


    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number : ");
        int num2 = input.nextInt();
        int add = num1+num2;

        return add;
    }
}