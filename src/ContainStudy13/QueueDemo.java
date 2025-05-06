package ContainStudy13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueDemo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Queue<String> queue = new LinkedList<String>();

        System.out.println("輸入名稱(使用quit結束)");
        while (true){
            System.out.println("# ");
            String input = src.next();
            if(input.equals("quit")){
                break;
            }else{
                queue.offer(input);  //offer():加入元素至柱列中
            }
        }

        System.out.println("顯示輸入:");
        String element = null;
        // poll()：取得並移去佇列中的元素
        // 佇列為空時傳回null
        while ((element = queue.poll()) != null){
            System.out.println(element+" ");
        }
        System.out.println();
    }
}
