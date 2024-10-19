import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();

        System.out.print("Enter number to count : ");
        int n = in.nextInt();

        int count = 0 ;

        while (num>0){

            int rem = num % 10 ;

            if(rem == n){
                count++;
            }

            num = num/10;

        }

        System.out.println(count);

    }
}