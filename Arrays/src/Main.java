import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] rnos1 = new int[5];
        //or directly
        int[] rnos2 = {1,2,3 ,4, 5};

        int[] rnos; //declaration of arrays. rnos is getting defined in the stack
        rnos = new int[5]; //initilazation. Actaually here object is being defined in the heap memory

        rnos[0] = 1;
        rnos[1] = 2;
//        rnos[2] = 3;
        rnos[3] = 4;
        rnos[4] = 5;
        System.out.println(rnos[2]);


        // String
        String[] arr = new String[4];
        arr[2] = "Deepak";
        System.out.println(arr[0]);

        System.out.println(Arrays.toString(rnos));

        //input using array

        Scanner in = new Scanner(System.in);

        String[] name = new String[5];

        for(int i = 1 ; i < name.length + 1 ; i++){

            System.out.print("Enter the " + i  + " name : ");
            name[i-1] = in.next();

        }

        for (String s : name) {
            System.out.print(s + " ");

        }

        System.out.println(Arrays.toString(name));




    }

}