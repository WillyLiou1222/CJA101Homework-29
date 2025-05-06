package ContainStudy13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnhancedForDemo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        System.out.println("輸入名稱(輸入quit結束)");
        while (true){
            System.out.println("# ");
            String input = src.next();
            if(input.equals("quit")){
                break;
            }else {
                list.add(input);
            }
        }

        for(String i:list){
            System.out.println(i+" ");
        }
        System.out.println();
    }
}
