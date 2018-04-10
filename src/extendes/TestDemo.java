package extendes;

public class TestDemo {
    public static void main(String[] args) {
        Kids someKid= new Kids();
        someKid.setYearsOld(12);
        someKid.setSex(1);
        someKid.setSalary(0);
        someKid.printAge();
        someKid.manOrWoman();
        someKid.employeed();
    }
}
