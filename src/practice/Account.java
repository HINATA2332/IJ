package practice;
public class Account{

    protected int id;
    protected double balance;
    protected double annualInterestRate;
    public Account (int id, double balance, double annualInterestRate ){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }
    //取钱
    public void withdraw (double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("取钱成功,取走："+amount);
        }
        else{
            System.out.println("取钱失败，余额不足");
        }
    }
    //存钱
    public void deposit (double amount){
        balance+=amount;
        System.out.println("存钱成功，现在余额为："+balance);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

}

