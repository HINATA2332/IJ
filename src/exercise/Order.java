package exercise;

/**
 * 1.编写Order类，有int型的orderId，String型的OrderName，相应的getter()和setter()方法，
 * 两个参数的构造器，重写父类的equals()方法：public boolean equals(Object obj)，
 * 并判断测试类中创建的两个对象是否相等。



 */
public class Order {
    public static void main(String[] args) {
        Order o1=new Order(12,"aa");
        Order o2=new Order(12,"aa");
        System.out.println(o1.equals(o2));
    }
    private int orderId;
    private String orderName;
public Order(int orderId,String orderName){
    this.orderId=orderId;
    this.orderName=orderName;
}
@Override
public boolean  equals(Object obj){
    Object obj1=new Object();
    Object obj2=new Object();
    if(obj1 == obj2)
    {
        return true;
    }
    else {
        return  false;
    }
}
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
