package hw5;

public class Hw5Study03 {
	public static double maxElement(int x[][]){
        int max = x[0][0];
        for (int[] row : x) {         // 用 for-each
            for (int value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
    public static double maxElement(double x[][]){
        double max = x[0][0];
        for (double[] row : x) {         // 用 for-each
            for (double value : row) {
                if (value > max) {
                    max = value;
                }
            }
        }
        return max;
    }
    
	public static void main(String[] args) {
		//• 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
        //可以找出二維陣列的最大值並回傳,如圖:
        int[][] intArray = {{1, 6, 3},
                            {9, 5, 2}
                           };
        double[][] doubleArray = {{1.2, 3.5, 2.2},
                                  {7.4, 2.1, 8.2}
                                 };
        System.out.println("二維陣列的最大值:");
        System.out.println((int)maxElement(intArray));
        System.out.println(maxElement(doubleArray));
	}
}
