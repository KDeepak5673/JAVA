public class Main {
    public static void main(String[] args) {

        int i = 144542;

        int revNo = 0;

        while(i > 0){
            int rem = i % 10;

            i = i/10;

            revNo = revNo * 10 + rem;
        }

        System.out.println(revNo);

    }
}