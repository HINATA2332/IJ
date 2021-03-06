package exercise.exercise2;

import practice.CheckAccount;

public class Circle extends GeometricObject {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(){

        this.radius=1.0;
    }
    public Circle(double radius){
        super();
        this.radius=radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight){
        super();
    }
    //计算圆的面积
    public double findArea(){
        return Math.PI*this.radius*this.radius;
    }
//    //重写方法equals();
//    public boolean equals(Circle c){
//        if(this== c){
//            return true;
//        }
//        else if(c instanceof Circle){
//
//Circle cc= (Circle) c;
//return this.radius==cc.radius;
//        }
//        else{
//            return false;
//        }
//    }
//    @Override
//    public String toString(){
//return "radius:"+radius;
//    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
