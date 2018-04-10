package practice;

import tql.Test;

public class Test3{
    private int s = 111;
    public class B {
        private int s = 222;
        public void mb(int s) {
            System.out.println(s);
            // 局部变量s
            System.out.println(this.s);
            // 内部类对象的属性s
            System.out.println(Test3.this.s);
            // 外层类对象属性s
        }
    }
    public static void main(String args[]){
        Test3 a = new Test3();
        Test3.B b = a.new B();
        b.mb(333);
    }}

