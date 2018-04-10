package exercise.exercise1;

public class Order1 {
    public static void main(String[] args) {
        Order2 o2=new Order2();
        System.out.println(o2);
    }
}
class Order2{
    private int id=10001;
    private String name;


        {
                 id=1002;
             name= "233";
            System.out.println("我是1");
        }

    public Order2()
    {
        super();
    }

    public Order2(int id, String name) {
       super();
        this.id = id;
        this.name = name;
    }
}