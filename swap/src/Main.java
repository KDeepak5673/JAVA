public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("First : " + a + " Second : " + b);

        swap(a , b);

        //swap does not change the value of a and b by method
        //This is because java uses PASS-BY-VALUE for method arguments
        //Java's pass-by-value nature prevents the swap method from modifying the original values or references outside the method.
        System.out.println("First : " + a + " Second : " + b);
    }

    static void swap(int num1 , int num2){
        int temp = num1;
        num1 = num2;

        num2 = temp;

        System.out.println("First1 : " + num1 + " Second2 : " + num2);


    }
}