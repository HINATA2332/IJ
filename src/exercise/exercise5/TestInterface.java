package exercise.exercise5;

public class TestInterface {
    public static void main(String[] args) {
        ComparableCircle cc1= new ComparableCircle();
        ComparableCircle cc2= new ComparableCircle();
        cc1.setRaduis(2.3);
        cc2.setRaduis(2.5);
        System.out.println(cc1.compareTo(cc2));
    }



}
