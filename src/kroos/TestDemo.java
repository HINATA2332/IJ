package kroos;

/**
 * 测试类
 * @author siyu-kroos
 */

class Person {
    private static int id;
    private String name;
    private static int total = 0;
    public void eat(){
        System.out.println("吃饭");
    }
    public static int getTotalPerson() {
        id++;	//非法
        return total;
    }
    public Person() {
super();
    }
    public Person(String name)
    {
        super();
        this.name =name;
    }
    public static class TestPerson {
        public static void main(String[] args) {
            System.out.println("Number of total is " + getTotalPerson());
            //没有创建对象也可以访问静态方法
            Person p1 = new Person();
            System.out.println( "Number of total is "+ getTotalPerson());
        }
    }
}








