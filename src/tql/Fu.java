package tql;

class Fu
{
    boolean show(char a)
    {
        System.out.println(a);
        return true;
    }
}
class Demo extends Fu
{
    public static void main(String[] args)
    {
        int i=0;
        Fu f=new Demo();
        Demo d=new Demo();
        for(f.show('A'); f.show('B')&&(i<2);f.show('C'))
        {
            i++;
            d.show('D');
        }
    }
    @Override
    boolean show(char a)
    {
        System.out.println(a);
        return true;
    }
}
