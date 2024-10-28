import java.util.Arrays;

public class passingInFunction {
    public static void main(String[] args) {
        int[] num = {23,4,5,3,4,34,3};


        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));

    }

    static void change(int[] arr){

//        System.out.println(Arrays.toString(arr));

        arr[4] = 45;
        arr[1] = 5;
        arr[0] = 1;

//        System.out.println(Arrays.toString(arr));
    }
}
