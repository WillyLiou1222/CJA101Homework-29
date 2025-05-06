package EncapsulationStudy07;

public class SafeArray {
    private int[] arr;

    public SafeArray(){
        this(10); //預設10個元素
    }

    public SafeArray(int length){
        arr = new int[length];
    }

    public void showElement(){
        for(int i:arr){
            System.out.println(i+" ");
        }
    }

    public int getElement(int i){
        if(i >= arr.length || i<0){
            System.out.println("索引錯誤");
            return 0;
        }
        return arr[i];
    }

    public int getLength(){
        return arr.length;
    }

    public void setElement(int i, int data){
        if(i >= arr.length || i<0){
            System.out.println("索引錯誤");
            return;
        }
        arr[i] = data;
    }
}
