package ContainStudy13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        System.out.println("輸入名稱(使用quit結束)");

        while (true){
            System.out.println("* ");
            String input = src.next();
            if(input.equals("quit")){
                break;
            }else {
                list.add(input);
            }
        }
        System.out.println("顯示輸入：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+",");
        }
        System.out.println();
    }
}
