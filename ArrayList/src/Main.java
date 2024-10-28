import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(45);
        list.add(64);
        list.add(45);

        System.out.println(list);

        int d = list.get(0);

        System.out.println(d);
    }
}