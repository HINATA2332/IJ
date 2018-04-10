package exercise.exercise4;

public class A1 {
    private int id;
    private String name;
    public A1(){
        System.out.println("A1无参构造");
    }

    public A1(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("A1的带参构造器");
    }
}
