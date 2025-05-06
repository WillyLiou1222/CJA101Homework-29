package GenericStudy12;

public class ConcreteFooDemo {
    public static void main(String[] args) {
        ConcreteFoo<String, Integer> c1 = new ConcreteFoo<>();
        c1.setFoo1("Hello");
        System.out.println(c1.getFoo1());
    }
}
