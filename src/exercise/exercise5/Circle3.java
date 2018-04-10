package exercise.exercise5;

/**
 * @author kroos
 */
public class Circle3 {
   private double raduis;

    public Circle3() {
        super();
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }
}
interface CompareObject{
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}

