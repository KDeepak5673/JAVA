import java.util.Arrays;
import java.util.Scanner;

public class SeachIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3 ,4},
                {4, 5 ,6, 7},
                {8, 9},
                {10 , 11 , 12 , 15},
                {16, 17, 18, 19 , 20 }
        };

        Scanner in = new Scanner(System.in);

        System.out.print("Enter no between 1 to 20 : ");
        int target = in.nextInt();

        int[] ans = Search(arr , target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] Search(int[][]arr , int tar){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if(arr[i][j] == tar ){
                    return new int[]{i+1 , j+1};
                }
            }
        }
        return new int[]{-1 ,-1};
    }
}
