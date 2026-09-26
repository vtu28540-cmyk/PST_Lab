import java.util.*;

public class JavaArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("List: " + list);

        list.add(1, 15);
        System.out.println("After insertion: " + list);

        list.remove(Integer.valueOf(20));
        System.out.println("After removal: " + list);

        System.out.println("Element at index 1: " + list.get(1));
    }
}
