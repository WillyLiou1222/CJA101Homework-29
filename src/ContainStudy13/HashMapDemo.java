package ContainStudy13;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Willy", 28);
        map.put("Jack", 29);
        System.out.println(map.get("Willy"));
        System.out.println(map.get("Jack"));
    }
}
