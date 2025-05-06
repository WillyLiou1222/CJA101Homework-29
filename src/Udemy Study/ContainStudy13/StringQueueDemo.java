package ContainStudy13;

import java.util.LinkedList;
import java.util.Scanner;

public class StringQueueDemo {
    public static void main(String[] args) {
        Scanner src= new Scanner(System.in);
        StringQueue queue = new StringQueue();

        System.out.println("輸入名稱(使用quit結束)");

        while (true){
            System.out.println("# ");
            String input = src.next();

            if(input.equals("quit")){
                break;
            }else{
                queue.push(input);
            }
        }

        System.out.println("顯示輸入:");
        while (!queue.isEmpty()){
            System.out.println(queue.get()+" ");
        }
        System.out.println();
    }
}
