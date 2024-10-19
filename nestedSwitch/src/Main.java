import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee Id : ");
        int empId = sc.nextInt();


        switch (empId) {
            case 1 -> System.out.println("Khushi Shivhare");
            case 2 -> System.out.println("Suhani Sinha");
            case 3 -> System.out.println("Subhadeep haldar");
            case 4 -> {
                System.out.println("Deepak kumar");
                System.out.print("Enter Department name : ");
                String department = sc.next();
                switch (department) {
                    case "CSE" -> System.out.println("CSE");
                    case "ECE" -> System.out.println("ECE");
                    default -> System.out.println("enter valid value");
                }
            }
            default -> System.out.println("Enter valid value");
        }
    }
}