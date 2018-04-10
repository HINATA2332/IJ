package practice;
interface C{
   String  func();

}
class D implements C
{
    @Override
    public String func()
    {
        return "func";
    }
}
class Demo2
{
    public static void main(String[] args)
    {
        C c=new D();
        System.out.println(c.func());
    }
}
