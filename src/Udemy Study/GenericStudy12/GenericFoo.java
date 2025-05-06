package GenericStudy12;

public class GenericFoo<T> {  //用T來宣告型態
    private T foo;

    public void setFoo(T foo) {
        this.foo = foo;
    }
    public T getFoo() {
        return foo;
    }
}
