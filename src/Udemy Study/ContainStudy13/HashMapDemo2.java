package ContainStudy13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo2 {
    public static void main(String[] args) {
        //可以使用 values() 方法返回一個實作 Collection 的物件，當中包括所有的「值」物件
        Map<String, Integer> map = new HashMap<>();
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

        //增強的 for 迴圈
        for(Integer i:map.values()){
            System.out.println(i);
        }
    }
}
