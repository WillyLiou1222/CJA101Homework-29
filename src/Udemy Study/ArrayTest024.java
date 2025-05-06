import java.util.ArrayList;

public class ArrayTest024 {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Mike");
        friends.add("Grace");
        System.out.println(friends);
        friends.clear();
        System.out.println(friends.size());

        ArrayList<Integer> arr = new ArrayList<>(); //要用全形Integer
        arr.add(15);
        System.out.println(arr);

        //Multi-dimensional array
        int[][] my2Darray = new int[4][3];
        my2Darray[2][0] = 10;
        my2Darray[0][2] = 3;
    }
}
