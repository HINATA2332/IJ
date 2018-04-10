package exercise.exercise1;

import org.junit.Test;

import java.beans.Transient;

public class TestMain {
@Test
public void test1(){
    System.out.println(233);
}



    public static void main(String[] args) {
        Main m= new Main();
        Main.main( new String[1000]);
    }
}
class Main{
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)
        {
            args[i]="value:"+i;
            System.out.println(args[i]);

        }
    }
}
