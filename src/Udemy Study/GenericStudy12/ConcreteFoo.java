package GenericStudy12;

public class ConcreteFoo<T1, T2> implements IFoo<T1, T2> {
    private T1 foo1;
    private T2 foo2;

    @Override
    public void setFoo1(T1 foo1) {
        this.foo1 = foo1;
    }
    @Override
    public T1 getFoo1() {
        return foo1;
    }

    @Override
    public void setFoo2(T2 foo2) {
        this.foo2 = foo2;
    }
    @Override
    public T2 getFoo2() {
        return foo2;
    }
}
