package practice;
/**
（1）	创建一个Customer ，名字叫 Jane Smith, 他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）	对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息



 写一个用户程序测试CheckAccount类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%，可透支限额为5000元的CheckAccount对象。
 使用withdraw方法提款5000元，并打印账户余额和可透支额。
 再使用withdraw方法提款18000元，并打印账户余额和可透支额。
 再使用withdraw方法提款3000元，并打印账户余额和可透支额。

 */

public class TestAccount{
    public static void main(String[] args) {
//        Customer cust=new Customer("jane","smith");
//Account a =new Account(1000,2000,0.0123);
//cust.setAccount(a);
//a.deposit(100);
//a.withdraw(960);
//a.withdraw(2000);
//        System.out.println("name"+cust.getFirstName()+cust.getLastName()+"ID:"
//                +a.getId()+"余额"+a.getBalance()+"存款利率:"+a.getAnnualInterestRate());

        CheckAccount c= new CheckAccount(1122,20000,0.045,5000);
c.withdraw(5000);
c.withdraw(18000);
c.withdraw(3000);
    }
}
