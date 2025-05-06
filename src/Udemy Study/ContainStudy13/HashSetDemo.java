package ContainStudy13;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();  //不會依照加入順序排列
        set.add("Willy");
        set.add("Denny");
        set.add("Winnie");
        //故意重複
        set.add("Willy");

        // 使用 Iterator 顯示物件
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

        set.remove("Winnie");
        for(String i:set){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
