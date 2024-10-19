import java.util.Scanner;

public class para_args {
    public static void main(String[] args) {

        int ans = sum(20, 40 );
        System.out.println(ans);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name you Wants to greet : ");
        String name = input.next();

        String gre = greet(name);

        System.out.println(gre);


    }

    static int  sum(int a , int b ) {
        int sum = a+b;

        return sum;

    }

    static String greet(String name){
        String greeting = "hello " + name;

        return greeting;
    }
}
