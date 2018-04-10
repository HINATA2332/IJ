package tql;
//判断是哪一年的第X天，其中包含闰年的判断
import javax.xml.soap.SOAPPart;
import java.util.Scanner;

public class Test3nianyueripanduan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int[] MyInt=new int[i];
        String a;String b; String c;
        String strs[] = new String[]{"a" ,"b","c"};

        System.out.println("输入年");
        int year =scanner.nextInt();
        System.out.println("输入月");
        int month =scanner.nextInt();
        System.out.println("输入日");
        int day =scanner.nextInt();
        int SumDay=0;
        switch (month){
            case 12:
                SumDay+=30 ;

            case 11:
                SumDay+=31;

            case 10:
                SumDay+=30;

            case 9:
                SumDay+=31;

            case 8:
                SumDay+=31;

            case 7:
                SumDay+=30;

            case 6:
                SumDay+=31;

            case 5:
                SumDay+=30;

            case 4:
                SumDay+=31;

            case 3:
                //计算闰年的二月天数
                if(year%4==0&&year%100!=0||year%400==0){
                    SumDay+=29;
                }
                else {
                    SumDay+=28;
                }

            case 2:
                SumDay+=31;



            case 1:
                SumDay+=day;
        }
        System.out.println(year+"年"+month+"月"+day+"日"+"今天是今年的第"+SumDay+"天");


    }
}

