package in.kgcoding.challenge_90;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Zebra", "Lion", "Ant");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }

    public static void sortInDescending(List<String> stringList) {
        Collections.sort(stringList);
    }
}
