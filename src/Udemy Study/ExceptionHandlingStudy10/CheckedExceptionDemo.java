package ExceptionHandlingStudy10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        try {
            BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("請輸入整數:");
            int input = Integer.parseInt(buf.readLine());
            System.out.println("input * 10 ="+(input*10));
        } catch (IOException e) {   //chexked Exception
            System.out.println("I/O錯誤");
            //e.printStackTrace();
        }catch (NumberFormatException e){  //Runtime Exception
            System.out.println("輸入必須為整數");
        }
    }
}
