import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of array : ");

        int length = in.nextInt();

        System.out.print("Enter the array : ");

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in.next());
        }

        System.out.print("Enter target Integer : ");
        int target = in.nextInt();

        boolean ans = Search(arr , target);

        System.out.println("Is target element exists : " + ans);

    }

    static boolean Search(int[] array, int target) {

        for (int j : array) {
            if (j == target) {

                return true;
            }

        }
        return false;
    }
}