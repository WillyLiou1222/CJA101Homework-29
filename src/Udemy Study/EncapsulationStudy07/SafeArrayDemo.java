package EncapsulationStudy07;

public class SafeArrayDemo {
    public static void main(String[] args) {
        SafeArray arr1 = new SafeArray(); //會是預設的10個
        SafeArray arr2 = new SafeArray(5);

        for (int i = 0; i < arr1.getLength(); i++) {
            arr1.setElement(i, (i+1));
        }
        for (int i = 0; i < arr2.getLength(); i++) {
            arr2.setElement(i, (i+1));
        }

        System.out.println("arr1:");
        arr1.showElement();
        System.out.println("arr2:");
        arr2.showElement();
    }
}
