package hw3;

import java.util.Scanner;

public class Hw3Study01Method {
	public int[] getThree(){
        int[] data = new int[3];
        Scanner src = new Scanner(System.in);
        if(src.hasNextInt()){
            for (int i = 0; i < data.length; i++) {
                data[i] = src.nextInt();
            }
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }
        return data;
    }
    public void judgeThree(int[] triangles){
        if(triangles[0] != 0 || triangles[1] != 0 || triangles[2] != 0){
            if(triangles[0] == triangles[1] && triangles[1] == triangles[2]){
                System.out.println("正三角形");
            }
            else if (triangles[0] == triangles[1] || triangles[1] == triangles[2]) {
                System.out.println("等腰三角形");
            }
            else if (Math.pow(triangles[0],2) == Math.pow(triangles[1],2)+Math.pow(triangles[2],2) || Math.pow(triangles[1],2) == Math.pow(triangles[2],2)+Math.pow(triangles[0],2) || Math.pow(triangles[2],2) == Math.pow(triangles[0],2)+Math.pow(triangles[1],2)) {
                System.out.println("直角三角形");
            }
            else if (triangles[0]+triangles[1] > triangles[2] || triangles[1]+triangles[2] > triangles[0] || triangles[2]+triangles[0] > triangles[1]) {
                System.out.println("其他三角形");
            }
            else {
                System.out.println("不是三角形");
            }
        }
        else{
            System.out.println("不是三角形");
        }
    }
	public static void main(String[] args) {
//      請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//      三角形、其它三角形或不是三角形,如圖示結果:
//
//      (提示:Scanner,三角形成立條件,判斷式if else)
//      (進階功能:加入直角三角形的判斷)
      Hw3Study01Method hw3Mthd2 = new Hw3Study01Method();
      System.out.println("請輸入三個整數：");
      int[] triangles = hw3Mthd2.getThree();

      hw3Mthd2.judgeThree(triangles);
	}
}
