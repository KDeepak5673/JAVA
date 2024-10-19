import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int num1 = input.nextInt();

        System.out.print("Enter Second Number : ");
        int num2 = input.nextInt();

        System.out.print("Enter Third Number : ");
        int num3 = input.nextInt();

        int largestNumber = num1;

        if(num1 > num2) {
            if (num3 > num1) {
                largestNumber = num3;
            }
        }
        else{
            if (num3 > num2 ){
                largestNumber = num3;
            }
            else {
                largestNumber = num2;
            }
        }
        System.out.println(largestNumber);
    }
}
