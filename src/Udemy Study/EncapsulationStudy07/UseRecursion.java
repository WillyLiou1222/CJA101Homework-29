package EncapsulationStudy07;

import java.util.Scanner;

public class UseRecursion {
    public static int gcd(int m, int n){
        if(n == 0){
            return m;
        }
        else{
            return gcd(n,m%n);
        }
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("輸入兩數:");
        System.out.println("m:");
        int m = src.nextInt();
        System.out.println("n:");
        int n = src.nextInt();

        System.out.println("GCD:"+gcd(m,n));
    }
}
