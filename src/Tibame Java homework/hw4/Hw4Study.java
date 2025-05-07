package hw4;

import java.util.Scanner;

public class Hw4Study {
    public static void main(String[] args) {
//        有個一維陣列如下:
//        {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//        請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//        (提示:陣列,length屬性)
        int[] arr1 = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        int average = (sum / arr1.length);
        System.out.println("所有元素的平均值:" + average);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > average) {
                System.out.println("大於平均值的元素:");
                System.out.println(arr1[i]);
            }
        }

        System.out.println();
//       請建立一個字串,經過程式執行後,輸入結果是反過來的
//        例如String s = “Hello World”,執行結果即為dlroW olleH
//        (提示:String方法,陣列)
        String[] s = {"H", "e", "l", "l", "o", " ", "W", "o", "r", "l", "d"};
        for (int i = s.length - 1; i > 0; i--) {
            System.out.print(s[i]);
        }
        System.out.println();
//        有個字串陣列如下 (八大行星):
//        {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//        請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//        (提示:字元比對,String方法)
        String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
        int count1 = 0;
        for (int i = 0; i < planet.length; i++) {
            for (int j = 0; j < planet[i].length(); j++) {
                switch (planet[i].charAt(j)) {   //取得字串內字元
                    case 'a':
                        count1 += 1;
                        break;
                    case 'e':
                        count1 += 1;
                        break;
                    case 'i':
                        count1 += 1;
                        break;
                    case 'o':
                        count1 += 1;
                        break;
                    case 'u':
                        count1 += 1;
                        break;
                }
            }
        }
        System.out.println("總共有多少個母音(a, e, i, o, u):" + count1);
//        阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//        表如下:
//
//        請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//        有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//        員工編號: 25 19 27 共 3 人!」
//
//        (提示:Scanner,二維陣列)
        int[][] lendMember = {
                {25, 32, 8, 19, 27},
                {2500, 800, 500, 1000, 1200}
        };
        int count2 = 0;
        System.out.println("請輸入預借金額:");
        Scanner src1 = new Scanner(System.in);
        int member = src1.nextInt();
        for (int i = 0; i < lendMember[1].length; i++) {
            if (member < lendMember[1][i]) {
                count2 += 1;
                System.out.println("有錢可借的員工編號:" + lendMember[0][i] + " ");
            }
        }
        System.out.println("共" + count2 + "人");
        System.out.println();

//        班上有8位同學,他們進行了6次考試結果如下:
//        請算出每位同學考最高分的次數
//        (提示:二維陣列)
//        考試成績：6次考試，8位同學
        int[][] exam = {
                            {10, 35, 40, 100, 90, 85, 75, 70},
                            {37, 75, 77, 89, 64, 75, 70, 95},
                            {100, 70, 79, 90, 75, 70, 79, 90},
                            {77, 95, 70, 89, 60, 75, 85, 89},
                            {98, 70, 89, 90, 75, 90, 89, 90},
                            {90, 80, 100, 75, 50, 20, 99, 75},
                        };

        // 用來記錄每位同學考最高分的次數
        int[] highestScoreCount = new int[8];

        // 遍歷每次考試，對每位同學的分數進行檢查
        for (int i = 0; i < 6; i++) { // 6次考試
            int maxScore = Integer.MIN_VALUE;

            // 找出這次考試的最高分
            for (int j = 0; j < 8; j++) { // 8位同學
                if (exam[i][j] > maxScore) {
                    maxScore = exam[i][j];
                }
            }

            // 找出考試中最高分的同學，並增加他們的最高分次數
            for (int j = 0; j < 8; j++) {
                if (exam[i][j] == maxScore) {
                    highestScoreCount[j]++; // 增加該同學考最高分的次數
                }
            }
        }

        // 顯示每位同學考最高分的次數
        for (int i = 0; i < 8; i++) {
            System.out.println("同學 " + (i + 1) + " 考最高分的次數: " + highestScoreCount[i]);
        }



//        • 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//        例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//        (提示1:Scanner,陣列)
//        (提示2:需將閏年條件加入)
//        (提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
        Scanner src2 = new Scanner(System.in);

        // 輸入年份、月份和日期
        System.out.print("請輸入年份 (yyyy): ");
        int year = src2.nextInt();
        System.out.print("請輸入月份 (mm): ");
        int month = src2.nextInt();
        System.out.print("請輸入日期 (dd): ");
        int day = src2.nextInt();

        // 檢查月份和日期是否有效
        if (month < 1 || month > 12) {
            System.out.println("錯誤: 請輸入有效的月份 (1-12)");
            return;
        }

        // 這裡是每個月份的天數，預設為普通年份
        int[] everyMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 檢查是否是閏年，若是閏年，二月的天數設為29
        if (isLeapYear(year)) {
            everyMonth[1] = 29; // 2月有29天
        }

        // 檢查日期是否有效
        if (day < 1 || day > everyMonth[month - 1]) {
            System.out.println("錯誤: 請輸入有效的日期");
            return;
        }

        // 計算是該年的第幾天
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += everyMonth[i];
        }
        dayOfYear += day;

        // 顯示結果
        System.out.printf("輸入的日期為該年第 %d 天。\n", dayOfYear);
    }

        // 檢查是否為閏年
        public static boolean isLeapYear ( int year){
            if (year % 400 == 0) {
                return true;
            } else if (year % 100 == 0) {
                return false;
            } else if (year % 4 == 0) {
                return true;
            }
            return false;
        }
}
