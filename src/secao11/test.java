package secao11;

import java.util.*;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,5,6,7);
        HashMap<Integer, String> hp = new HashMap<>();
        int highestNumber = 0;

        for (int j : list) if (j > highestNumber) highestNumber = j;
        Integer max = list.stream().mapToInt(x -> x).max().orElseThrow();
        System.out.println(max);
        System.out.println(highestNumber);

        String original = "Hello";
        String reversed = new StringBuilder(original).reverse().toString();
    }
}
