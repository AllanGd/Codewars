package katas;

import java.util.ArrayList;
import java.util.List;

public class FindOutlier {
    public static int find(int[] integers){
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int i :
                integers) {
            if (0 == (i%2)) {
                even.add(i);
            }else {
                odd.add(i);
            }
            }
        return (odd.size() > even.size() ? even : odd).get(0);
    }
}
