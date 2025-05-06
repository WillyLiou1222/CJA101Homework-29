package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		System.out.println("請輸入x,y數字(須為正整數)：");
        Scanner src = new Scanner(System.in);
        int x = src.nextInt();
        int y = src.nextInt();
        try {
            Calculator pow1 = new  Calculator(x,y);
            System.out.printf("%d的%d次方為：",x,y);
            System.out.println(pow1.pupowerXY(x,y));
        } catch (CalException e) {
            e.printStackTrace();
        }
	}
}
