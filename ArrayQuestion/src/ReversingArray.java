import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {23, 25, 12, 22, 44};

        System.out.println(Arrays.toString(arr));

        revese(arr  );

        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] array, int in1 , int in2){
        int temp = array[in2];
        array[in2] = array[in1];
        array[in1] = temp;

    }

    static void revese(int[] revarr){
        int start = 0;
        int end = revarr.length-1;

        while (start<end){
            swap(revarr, start,end);
            start++;
            end--;
        }

    }
}
