package hw3;

import java.util.Scanner;

public class Hw3Study03Method {
	public void chooseNumber(){
        Scanner src = new Scanner(System.in);
        int inser1 = src.nextInt();
        int count = 0;
        for(int d10=0;d10<=4;d10++){
            if(d10 == inser1){
                continue;
            }
            for(int d1=0;d1<=9;d1++){
                if(d1==inser1){
                    continue;
                }
                else if (d1 != 0 && d10 == 0) {
                    System.out.println(d1+" ");
                    count+=1;
                }
                else if (d10 > 0) {
                    System.out.println(d10+""+d1+" ");
                    count+=1;
                }
            }
        }
        System.out.println("總共有"+count+"個");
    }
	public static void main(String[] args) {
//      阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//      厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//      的號碼與總數,如圖:
      Hw3Study03Method hw3Mthd3 = new Hw3Study03Method();
      System.out.println("阿文...請輸入你討厭哪個數字:");
      hw3Mthd3.chooseNumber();
	}
}
