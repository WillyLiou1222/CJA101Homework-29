package hw7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Hw7Study02 {
	public static void main(String[] args) {
//      請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡 (請使用
//      append功能讓每次執行結果都能被保存起來)
      Random random = new Random();
      StringBuilder sb = new StringBuilder();

      // 產生 10 個亂數並用逗號分隔
      for (int i = 0; i < 10; i++) {
          int number = random.nextInt(1000) + 1; // 產生 1~1000 的整數
          sb.append(number);
          if (i < 9) {
              sb.append(", ");
          }
      }
      sb.append("\n"); // 換行

      // 將結果寫入檔案 (使用 append 模式)
      try (FileWriter writer = new FileWriter("D:\\Java課程專案\\Workspace\\Homework-29\\src\\hw7\\Data.txt", true)) {
          writer.write(sb.toString());
          System.out.println("亂數已寫入 Data.txt");
      } catch (IOException e) {
          System.err.println("寫入檔案時發生錯誤: " + e.getMessage());
      }
	}
}
