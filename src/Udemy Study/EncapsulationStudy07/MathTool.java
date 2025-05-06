package EncapsulationStudy07;

public class MathTool {
    public static int sum(int... nums){
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = 0;
        sum = MathTool.sum(1,2,3,4,5);
        System.out.println(sum);

        sum = MathTool.sum(1,2,3);
        System.out.println(sum);

    }
}
