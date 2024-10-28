import java.util.Arrays;

public class SwapValue {
    public static void main(String[] args) {
        int[] arr = {23, 25, 12, 22, 44};

        System.out.println(Arrays.toString(arr));

        swap(arr , 0 , 2 );

        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] array, int in1 , int in2){
        int temp = array[in2];
        array[in2] = array[in1];
        array[in1] = temp;

    }
}
