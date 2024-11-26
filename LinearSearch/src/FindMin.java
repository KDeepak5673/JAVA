import java.util.Scanner;

public class FindMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of array : ");
        int length = sc.nextInt();

        int[] array = new int[length];

        System.out.print("Enter the array : ");
        for (int i = 0; i < length; i++) {
            array = new int[]{sc.nextInt()};

        }

        int ans = Minimum(array);

        System.out.println("Minimum is : " + ans);

    }


    static int Minimum(int[] arr){

        int min = arr[0];

        for (int i = 0; i < arr.length - 1 ; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}
