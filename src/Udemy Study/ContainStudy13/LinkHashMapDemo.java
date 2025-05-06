package ContainStudy13;

import java.util.*;

public class LinkHashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();  //依照插入的順序來排列
        map.put("Willy", 28);
        map.put("Jack", 29);
        map.put("Denny", 48);
        map.put("Winnie", 48);

        Collection collection = map.values();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
