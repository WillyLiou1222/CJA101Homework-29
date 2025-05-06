package ContainStudy13;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>(); //依「鍵」的字典順序來排列
        map.put("Willy", 28);
        map.put("Jack", 29);
        map.put("Denny", 48);
        map.put("Winnie", 48);

        for(Integer i:map.values()){
            System.out.println(i);
        }
    }
}
