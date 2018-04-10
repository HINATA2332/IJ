package extendes;

public class ManKind {
    private int sex;
    private int salary;
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
public void manOrWoman(){
        if(sex ==1 ) {
            System.out.println("性别:man");
        }
 else if(sex==0){
    System.out.println("性别：woman");
}
else  {
        System.out.println("您的输入有误");

}
    }
    public void employeed() {
        if (salary == 0) {
            System.out.println("no job!");
        }

      else  if (salary > 0) {
            System.out.println(" job!");
        }
    }

}
