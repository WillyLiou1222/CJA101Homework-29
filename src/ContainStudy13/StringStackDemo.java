package ContainStudy13;

import java.util.Scanner;

public class StringStackDemo {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        StringStack stack = new StringStack();

        System.out.println("輸入名稱(使用quit結束)");

        while (true){
            System.out.println("# ");
            String input = src.next();
            if(input.equals("quit")){
                break;
            }else{
                stack.push(input);
            }
        }

        System.out.println("顯示輸入");
        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" ");
        }
        System.out.println();
    }
}
