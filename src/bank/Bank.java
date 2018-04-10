package bank;

/**
 * @author siyu-kroos
 */
public class Bank {
    public static void main(String[] args) {
       Account newacc= new Account(1122,20000,0.045);
newacc.withdraw(30000);

        //取款2500
        newacc.withdraw(2500);
        //存款3000
        newacc.deposit(3000);



    }
}

class Account{


    private int id;
    private double balance;
    private  double annualInterestRate;
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
    public Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;

    }
    public void getMonthlyInterest(){

    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("余额不足！"+"\n"+"您的账户余额为："+balance);
        }
        }

    public void deposit(double amount){
        balance += amount;
        System.out.println("您的账户余额为："+balance+"\n"+"月利率为"+annualInterestRate);
    }

}