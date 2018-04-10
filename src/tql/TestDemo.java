
package tql;

class MyThread implements Runnable {
    private int ticket = 5;

    @Override
    public void run() {
        for (int x = 0; x < 20; x++) {
            this.sale();
        }

    }
    public synchronized void sale(){
                if (this.ticket > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "卖票，ticket=" + this.ticket--);
                }
            }
}


public class TestDemo{
    public static void main(String[] args)throws Exception {
            MyThread mt = new MyThread();
        new Thread(mt,"票贩子A").start();
            new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();
        new Thread(mt,"票贩子D").start();
        }
        }


/*package tql;
public class TestDemo {
    public static void main(String[] args) {
        StringBuffer buf = new StringBuffer();
        buf.append("233 ").append("2333 ").append("23333 ");
        change(buf);
        System.out.println(buf);

    }


    public static void change(StringBuffer temp) {
        temp.append("\n").append("233333");
    }
}
*/