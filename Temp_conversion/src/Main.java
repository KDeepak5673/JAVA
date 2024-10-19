import java.util.Scanner;

class tempreature {
    void CToF() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Tempearture in Celsius : ");
        float tempinC = input.nextFloat();
        float tempinF = (tempinC*9/5) + 32;

        System.out.println("Tempreature in Fahrenheit : "  + tempinF);
    }
    void FToC() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Tempearture in Fahreheit : ");
        float tempinF = input.nextFloat();
        float tempinC = (tempinF - 32 ) * 5 / 9 ;

        System.out.println("Tempreature in Celsius : "  + tempinC);
    }
    void CToK() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Tempearture in Celsius : ");
        float tempinC = input.nextFloat();
        float tempinK = (tempinC + 273);

        System.out.println("Tempreature in Kelvin : "  + tempinK);
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("for Celsius to Fahrenheit : 1");
        System.out.println("for Fahrenheit to Celsius : 2");
        System.out.println("for Celsius to Kelvin : 3");

        tempreature temp = new tempreature();


        System.out.print("Enter your choice : ");
        int choice = input.nextInt();

        switch (choice){
            case 1 : temp.CToF();
            break;

            case 2 : temp.FToC();
            break;

            case 3 : temp.CToK();
            break;

            default:
                System.out.println("Invlaid Choice");
        }


    }
}