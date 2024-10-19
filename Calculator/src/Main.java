import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int result = 0;

        while(true){
            System.out.print("Enter Operator : ");
            char operator = input.next().trim().charAt(0);

            if(operator == '+' || operator == '-' || operator == '*' ||operator == '/' ||operator == '%' ){
                //inout two number
                System.out.print("First Number : ");
                int num1 = input.nextInt();
                System.out.print("Second Number : ");
                int num2 = input.nextInt();

                if (operator == '+'){
                    result = num1 + num2;
                }

                if (operator == '-'){
                    result = num1 - num2;
                }

                if (operator == '*'){
                    result = num1 * num2;
                }

                if (operator == '/'){
                    if(num2 != 0) {
                        result = num1 + num2;
                    }
                }

                if (operator == '%'){
                    result = num1 % num2;
                }

            }

            else if(operator == 'x' || operator == 'X'){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }

            System.out.println("Result : " + result);
        }


    }
}