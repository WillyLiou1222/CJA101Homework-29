package ContainStudy13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorDemo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.println("輸入名稱(輸入quit結束)");
        while (true){
            String input = src.next();
            if(input.equals("quit")){
                break;
            }else {
                list.add(input);
            }
        }

        //使用Iterator取得元素
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+", ");
        }
        System.out.println();
    }
}
