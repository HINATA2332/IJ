package tql;



class Message {
    private int data = 10;
    private boolean flag = true;

    public synchronized void add() {
        if (this.flag == false) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("加法操作" + this.data++);
        this.flag = false;}


    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }


    public  synchronized void  subtract(){
       if(this.flag==true){
           try{
               super.wait();
           }catch (InterruptedException e){
               e.printStackTrace();
           }
       }
           try{
               Thread.sleep(100);

       }catch (InterruptedException e)
           {
               e.printStackTrace();
           }
           System.out.println("减法操作"+this.data--);
       this.flag=true;
       super.notify();

   }

}
class Addition implements Runnable{
    private Message msg=null;
    public Addition(Message msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for(int x=0;x<50;x++){
            this.msg.add();
        }
    }
}
class Subtraction implements Runnable{
    private Message msg=null;
    public Subtraction(Message msg){
        this.msg=msg;
    }
    @Override
    public void run(){
        for(int x=0;x<50;x++){
            this.msg.subtract();
        }
    }
}
public class Test {
    public static void main(String args[]){
        Message msg =new Message();
        new Thread(new Addition(msg),"加法对象A").start();
        new Thread(new Addition(msg),"加法对象B").start();
        new Thread(new Subtraction(msg),"加法对象").start();
        new Thread(new Subtraction(msg),"减法对象").start();
    }


}
