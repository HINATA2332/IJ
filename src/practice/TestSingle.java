package practice;


class Single{
    private Single() {}
    //private的构造器，不能在类的外部创建该类的对象

    //私有的，只能在类的内部访问
    //private的构造器，不能在类的外部创建该类的对象

    private static Single onlyone = new Single();

    public static Single getSingle() {
        return onlyone;
    }
}
/**
 * @author siyu-kroos
 */
public class TestSingle{

    public static void main(String[] args) {
        Single  s1 = Single.getSingle();

        //访问静态方法
        Single  s2 = Single.getSingle();
        if (s1==s2){
            System.out.println("s1 is equals to s2!");
        }}}

