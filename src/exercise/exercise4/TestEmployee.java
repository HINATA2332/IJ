package exercise.exercise4;

public class TestEmployee {
    public static void main(String[] args) {
        Manager m1 =new Manager();
        m1.work();
    }

}
class Manager extends Employee{
   @Override
    public void work(){
        System.out.println("管理人员工作");
    }
}
abstract class Employee{
    private int id;
    private int age;
    private String name;
public abstract void work();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
