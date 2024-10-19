import java.util.Scanner;

public class IsprimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int num = in.nextInt();

        boolean prime = IsPrime(num);

        System.out.println(prime);



    }

    static boolean IsPrime(int n){
        if ( n <= 1 ){
            return false;

        }
        int a = 2 ;
        while(a * a <= n){
            if (n % a == 0 ) {
                return false;
            }
            a++;
        }
        if (a * a > n ){
            return true;
        }
        return false;

    }
}
