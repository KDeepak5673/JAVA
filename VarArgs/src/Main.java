import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        fun(4, 5 , 5 , 8  , 8);

        multiple(1, "Deepak kumar" , "Raj Kutir" , "Harishchandra nagar");

    }

    static void multiple(int a , String b , String ...v){
        System.out.println(Arrays.asList(a + b + Arrays.toString(v)));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}