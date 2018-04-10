package kroos;

public  class Creature2{

    public Creature2(){
        System.out.println("Creature无参数的构造器");
    }

  static class Animal2 extends Creature2 {
    public Animal2(String name) {
        System.out.println("Animal带一个参数的构造器，该动物的name为" + name);
    }

    public  Animal2(String name, int age) {
        this(name);
        System.out.println("Animal带两个参数的构造器，其age为" + age);
    }
}


}

