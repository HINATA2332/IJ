package exercise.exercise2;

/**
@author siyuzhou
 */

public class TestDemoC {
    public static void main(String[] args) {
Circle c1 =new Circle(2.3);
        Circle c2 =new Circle(2.3 );
        Circle c3=new Circle();
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
        System.out.println(c3.toString());

    }

}

