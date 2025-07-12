package StreamsPrograms;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(5, 9, 2, 8, 7);

        int max = l1.stream()
                         .max(Integer::compare)
                         .orElseThrow();

        System.out.println("Max: " + max);
    }
}
