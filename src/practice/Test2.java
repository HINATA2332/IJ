package practice;
interface Object{
    void action();
}
class ProxyObject implements Object{
    Object obj;
    @Override
    public void action(){
        System.out.println("代理开始");
        obj.action();
        System.out.println("代理结束");
    }
    public ProxyObject(){
        System.out.println("这是代理类");
        obj = new ObjectImpl();
    }
}
class ObjectImpl implements Object{
   @Override
    public void action(){
        System.out.println("======");
        System.out.println("======");
        System.out.println("被代理的类");
        System.out.println("======");
        System.out.println("======");
    }
}

/**
 * @author siyu-kroos
 */
public class Test2 {
    public static void main(String[] args) {
        Object ob= new ProxyObject();
        ob.action();
    }}



