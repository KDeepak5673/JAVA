import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();

        int[] array = new int[length];

        System.out.print("Enter the array : ");
        for (int i = 0; i < length; i++) {
            array = new int[]{sc.nextInt()};
        }


        System.out.print("Enter the target element : ");
        int target = sc.nextInt();

        System.out.print("Enter the initial range : ");
        int initialRange = sc.nextInt();

        System.out.print("Enter the final range : ");
        int finalRange = sc.nextInt();


        boolean ans = Search(array , target , initialRange, finalRange);

        System.out.println("Is the target element exists in given range : " + ans);
    }

    static boolean Search(int[] arr , int tar , int start , int end){

        for (int i = start; i <= end; i++) {
            if (arr[i] == tar ){
                return true;
            }


        }

        return false;
    }

}
