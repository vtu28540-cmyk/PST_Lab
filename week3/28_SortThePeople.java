import java.util.*;

public class SortThePeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        Integer[] indices = new Integer[names.length];

        for (int i = 0; i < names.length; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices, (a, b) -> Integer.compare(heights[b], heights[a]));

        String[] result = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            result[i] = names[indices[i]];
        }

        return result;
    }

    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};

        System.out.println(Arrays.toString(sortPeople(names, heights)));
    }
}
