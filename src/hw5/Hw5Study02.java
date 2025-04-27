package hw5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hw5Study02 {
	public void randAvg(){
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();
        int r;
        int sum = 0;
        System.out.println("10個亂數：");
        for (int i = 0; i < 10; i++) {
            r = (int)(Math.random()*101);
            list.add(r);
            System.out.print(r+" ");
            sum+=r;
        }
        System.out.println();
        System.out.println("10個亂數的平均值為:"+sum/ list.size());
    }
	
	public static void main(String[] args) {
		//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
        Hw5Study02 hw5S02 = new Hw5Study02();
        hw5S02.randAvg();
	}
}
