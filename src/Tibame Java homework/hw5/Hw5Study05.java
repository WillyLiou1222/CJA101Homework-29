package hw5;

import java.util.Random;

public class Hw5Study05 {
	public static String genAuthCode() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder authCode = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < 8; i++) {
            int index = rand.nextInt(chars.length());
            authCode.append(chars.charAt(index));
        }
        return authCode.toString();
    }
	
	public static void main(String[] args) {
		//身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
        //genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
        //與數字的亂數組合,如圖:
        System.out.println("本次隨機產生驗證碼：" + genAuthCode());
	}
}
