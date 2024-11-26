import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String element = sc.next();

        System.out.print("Enter the target character : ");
        char target  = sc.next().charAt(0);

        boolean ans = Search(element, target);

        System.out.println("Is character exists :  " + ans);



    }

    static boolean Search(String str , char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == target){
                return true;
            }



        }


        return false;

    }

}
