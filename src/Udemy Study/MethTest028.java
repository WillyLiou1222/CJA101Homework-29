public class MethTest028 {
    public MethTest028(){

    }
    public void sayHello(){
        System.out.println("Hello");
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        MethTest028 m = new MethTest028();
        m.sayHello();
        System.out.println(m.multiply(5,4));
    }
}
