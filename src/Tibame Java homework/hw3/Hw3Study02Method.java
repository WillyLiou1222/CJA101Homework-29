package hw3;

import java.util.Scanner;

public class Hw3Study02Method {
	public void printGuessAns9(int guessData1){
        int i1 = (int)(Math.random()*10);  //產生一個亂數0~9的數字
        Scanner src1 = new Scanner(System.in);
        end:    //標籤
        while (guessData1 != i1){
            if (src1.hasNextInt()) {
                guessData1 = src1.nextInt();
            }
            else {
                System.out.println("請輸入整數!");
                src1.nextInt();
            }
            if(guessData1 == i1){
                System.out.println("答對了，答案就是"+i1);
                System.out.println("遊戲結束!!!");
                break end;
            }
            else{
                System.out.println("猜錯囉!");
            }
        }
    }
    public void printGuessAns100(int guessData2){
        int i2 = (int)(Math.random()*101);  //產生一個亂數0~100的數字
        Scanner src2 = new Scanner(System.in);
        end:    //標籤
        while (guessData2 != i2){
            if (src2.hasNextInt()) {
                guessData2 = src2.nextInt();
            }
            else {
                System.out.println("請輸入整數!");
                src2.nextInt();
            }
            if(guessData2 == i2){
                System.out.println("答對了，答案就是"+i2);
                System.out.println("遊戲結束!!!");
                break end;
            }
            else if(guessData2 > i2){
                System.out.println("猜太大囉!");
            }
            else if (guessData2 < i2) {
                System.out.println("猜太小囉!");
            }
        }
    }
	public static void main(String[] args) {
//      請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//      對則顯示正確訊息,如圖示結果:
      Hw3Study02Method hw3Mthd1 = new Hw3Study02Method();
      System.out.println("此為猜數字遊戲，請輸入0~9之間的整數數字：");
      int guessTest1 = -1;
      hw3Mthd1.printGuessAns9(guessTest1);
      
//      (提示:Scanner,亂數方法,無窮迴圈)
//      (進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
      Hw3Study02Method hw3Mthd2 = new Hw3Study02Method();
      System.out.println("此為猜數字遊戲，請輸入0~100之間的整數數字：");
      int guessTest2 = -1;
      hw3Mthd2.printGuessAns100(guessTest2);
	}
}
