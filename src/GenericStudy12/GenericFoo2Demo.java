package GenericStudy12;

public class GenericFoo2Demo {
    public static void main(String[] args) {
        GenericFoo2<Boolean, Integer> foo1 = new GenericFoo2<>();
        GenericFoo2<Boolean, Integer> foo2 = new GenericFoo2<>();

        foo1.setFoo1(true);
        Boolean b = foo1.getFoo1();
        System.out.println(b);

        foo2.setFoo2(20);
        Integer i = foo2.getFoo2();
        System.out.println(i);

    }
}
