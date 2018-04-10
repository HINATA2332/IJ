package exercise.exercise4;

public class B1 extends A1 {
    public B1() {
        System.out.println("B1的无参构造");
    }

    public B1(String msg) {
        this();
        System.out.println("带参数构造器" + msg);
        System.out.println();
    }
}
