import java.util.Arrays;

public class MaximumValue {
    public static void main(String[] args) {
        int[] arr = {23, 25, 12, 22, 44};


        System.out.println(Max(arr));


    }
    static int Max(int[] array ){

        int maximum = array[0];

        for(int i = 0; i < array.length; i++) {
            if (array[i] > maximum){
                maximum = array[i];
            }
        }

        return maximum;

    }
}
