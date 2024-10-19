import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //create an array
        int[] arr = {1,3, 5 ,54 };
        change(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] num){
        num[0] = 9;
    }
}