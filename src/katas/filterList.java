package katas;

import java.util.ArrayList;
import java.util.List;

public class filterList {
    public static List<Object> filterList1(final List<Object> list){
        List<Object> listInt = new ArrayList<>();
        list.stream().filter(v -> v.getClass()==Integer.class).forEach(value -> listInt.add(value));
        return listInt;
    }
}
