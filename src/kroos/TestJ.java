package kroos;

import extendes.TestJurisdiction;

import java.util.Scanner;

public class TestJ {

    public static void main(String[] args) {
//        TestJurisdiction t = new TestJurisdiction();
//        t.name2 = "key";
                //
                //        Person p1 =new Wolf2();
                //        Person p2=new Person();
                //        //向下转型
                //        Wolf2 w3 =(Wolf2)p1;
                //        w3.imWolf2();
                //        p1.eat();
                //        p1.equals(w3);


        String S1= new String("aa");
        String S2= new String("aa");
        String S3="aa";
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
        System.out.println(S1==S3);
        System.out.println(S1.equals(S3));
        Wolf2 w2 =new Wolf2(12,"aa");
        Wolf2 w4=new Wolf2(12,"aa");
        System.out.println(w2==w4);
        System.out.println(w2.equals(w4));


    }
    public void func(Person p){
        p.eat();
    }

}
