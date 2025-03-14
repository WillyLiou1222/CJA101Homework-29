package hw1;

public class Hw1Study {
	public static void main(String[] args) {
        //請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12, b = 6;
        int sum = a + b;
        int acc = a * b;
        System.out.printf("%d+%d=%d",a,b,sum);
        System.out.println();
        System.out.printf("%d*%d=%d",a,b,acc);
        System.out.println();
        //請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
        int eggs = 200;
        double count = (double)(eggs/12);
        System.out.printf("200顆雞蛋總共有%.0f打",count);
        System.out.println();
        //請由程式算出256559秒為多少天、多少小時、多少分與多少秒
        int totalsecs = 256559;
        int oneday = (24*60*60);   //一天的秒數
        int days = totalsecs / oneday;
        int residualsecs = totalsecs % oneday;
        int onehour = (60*60);   //一小時的秒數
        int hours = residualsecs / onehour;
        residualsecs %= onehour;
        int oneminute = 60;   //一分鐘的秒數
        int minutes = residualsecs / oneminute;
        int secs = residualsecs % oneminute;
        System.out.printf("%d秒等於%d天,%d小時,%d分,%d秒",totalsecs,days,hours,minutes,secs);
        System.out.println();
        //請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
        final double pi = 3.1415;
        int radius = 5;
        double areal = (radius * radius) * pi;
        double circumference = (radius * 2) * pi;
        System.out.printf("半徑%d,圓面積=%.2f,圓周長=%.2f",radius,areal,circumference);
        System.out.println();
        //某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
        //金加利息共有多少錢 (用複利計算,公式請自行google)
        int funds= 1_500_000;
        double tenYearTotal = funds * Math.pow((1+0.02), 10);
        System.out.printf("本金%d元,10年後可拿到%.2f元",funds,tenYearTotal);
        System.out.println();
        //請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
        //5 + 5
        //5 + ‘5’
        //5 + “5”
        //並請用註解各別說明答案的產生原因
        System.out.println(5+5); //在java中，此兩數都為變數int，故可直接相加，相加後為10
        System.out.println(5+'5');//在java中，第二個數為變數char，會先轉換成ASCII的53，之後和第一個數int 5相加後變成58
        System.out.println(5+"5");//在java中，第二個數為變數String，所以會將第一個數int 5轉成字串，之後跟第二個字串5串接變成55
    }
}
