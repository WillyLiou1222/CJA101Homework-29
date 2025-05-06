package GenericStudy12;

public class GenericFoo3Demo {
    public static void main(String[] args) {
        GenericFoo3<Integer> foo = new GenericFoo3<>();
        Integer[] data = {1,2,3,4,5,6,7,8,9,10};
        foo.setFooArray(data);
        for(Integer i: foo.getFooArray()){
            System.out.println(i);
        }
    }
}
