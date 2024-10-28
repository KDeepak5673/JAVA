import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];


        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,9,8}
        };

        Scanner in = new Scanner(System.in);



        System.out.println(Arrays.toString(arr2[0]));

        // input
        for(int i = 0 ; i < arr.length  ; i++){
            for(int j = 0; j < arr[i].length ; j++){
                arr[i][j] = in.nextInt();
            }
        }

        //Output
        for (int[] value : arr) {
            for (int i : value) {
                System.out.print(i + "  ");
            }
            System.out.println();
        }

        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
}