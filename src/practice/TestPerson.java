package practice;

public class TestPerson {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setAge(23);
        p1.setName("kruse");
        p1.showInfo();

    }

}
class Person{
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public void showInfo(){
        System.out.println("name:"+name+"  "+"age:"+age);
    }
}
