package practice;
/**
 创建Account类的一个子类CheckAccount代表可透支的账户，
 该账户中定义一个属性overdraft代表可透支限额。在CheckAccount类中重写withdraw方法，其算法如下：
如果（取款金额<账户余额），
可直接取款
如果（取款金额>账户余额），
计算需要透支的额度
判断可透支额overdraft是否足够支付本次透支需要，如果可以
	将账户余额修改为0，冲减可透支金额
如果不可以
	提示用户超过可透支额的限额

 */
public class CheckAccount extends Account{
private double overdraft;
public CheckAccount(int id, double balance, double annualInterestRate,double overdraft){
    super( id, balance,annualInterestRate);
    this.overdraft=overdraft;
}
@Override
//取钱
public void withdraw (double amount){
    if(balance>=amount){
        balance-=amount;
        System.out.println("取钱成功,取走："+amount+"余额为："+balance);
    }
    else if((balance+overdraft)>amount){

        overdraft-=(amount-balance);
        balance=0;
        System.out.println("取钱成功，透支了"+(amount-balance)+"元"+"剩余可透支额度为："+overdraft);
    }
    else {
        System.out.println("取钱失败，余额加上透支额度无法承担当前的取款额度");
    }
}
}
