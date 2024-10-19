import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = in.nextInt();

        boolean arm = IsArmstrong(num);

        System.out.println(arm);

        for (int i = 1 ; i <= 999 ; i ++){
            if(IsArmstrong(i)){
                System.out.println(i);
            }
        }


    }
    static boolean IsArmstrong(int n ){
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n/10;
        }

        return sum == original;
    }
}
