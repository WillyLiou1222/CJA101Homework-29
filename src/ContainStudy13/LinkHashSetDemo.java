package ContainStudy13;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LinkHashSetDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();   //會依照加入順序排列
        set.add("Willy");
        set.add("Denny");
        set.add("Winnie");

        for(String i:set){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
