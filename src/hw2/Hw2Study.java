package hw2;

public class Hw2Study {
	public static void main(String[] args) {
		//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
        int sum1 = 0;
        for(int i=1;i<=1000;i++) {
            if(i % 2 == 0) {
                sum1+=i;
            }
        }
        System.out.printf("計算1~1000的偶數和：%d",sum1);
        System.out.println();
        //請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
        int a = 1;
        for(int i1=1;i1<=10;i1++) {
            a*=i1;
        }
        System.out.printf("計算1~10的連乘積：%d",a);
        System.out.println();
        //請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
        int a1 = 1;
        int i2 = 1;
        while(i2<=10) {
            a1*=i2;
            i2++;
        }
        System.out.printf("計算1~10的連乘積：%d",a1);
        System.out.println();
        //請設計一隻Java程式,輸出結果為以下:
        //1 4 9 16 25 36 49 64 81 100
        for(int i=1;i<=10;i++){
            System.out.printf("%d ",(int)(Math.pow(i,2)));
        }
        System.out.println();
        //阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
        //輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
        int count = 0;
        for(int d10=0;d10<=4;d10++){
            if(d10 == 4){
                continue;
            }
            for(int d1=0;d1<=9;d1++){
                if(d1==4){
                    continue;
                }
                else if (d1 != 0 && d10 == 0) {
                    System.out.print(d1+",");
                    count+=1;
                }
                else if (d10 > 0) {
                    System.out.print(d10+""+d1+",");
                    count+=1;
                }
            }
        }
        System.out.println("總共有"+count+"個");
        System.out.println();
        //請設計一隻Java程式,輸出結果為以下:
        //1 2 3 4 5 6 7 8 9 10
        //1 2 3 4 5 6 7 8 9
        //1 2 3 4 5 6 7 8
        //1 2 3 4 5 6 7
        //1 2 3 4 5 6
        //1 2 3 4 5
        //1 2 3 4
        //1 2 3
        //1 2
        //1
        for(int i=10;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //請設計一隻Java程式,輸出結果為以下:
        //A
        //BB
        //CCC
        //DDDD
        //EEEEE
        //FFFFFF
        char[] a3 = {'A','B','C','D','E','F'};
        for(int i=0;i<a3.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(a3[i]);
            }
            System.out.println();
        }
	}
}
