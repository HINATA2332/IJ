package exercise.exercise3;

import java.util.Scanner;
import java.util.Vector;
/**
 *
 * @author siyuzhou;
 * 学生成绩的录入与等级输出
 */

public class Vector1 {
    public static void main(String[] args) {


        //创建学生对象，并且从键盘输入他们的成绩并且保存；
        Vector v1 = new Vector();
        int maxScore=0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("请输入学生的成绩");
        //for循环的无限循环格式
        for (; ; )

        {
            int score = s1.nextInt();
if(maxScore< score){
    maxScore=score;
}
            if (score < 0) {
                break;
            }

//            Integer score1 = new Integer(score);
//            v1.addElement(score1);
            v1.addElement(score);
        }
        //用for循环来输出学生的信息
        for(int i=0;i<v1.size();i++){

           Integer score= (Integer) v1.elementAt(i);
            String  level =null;
            if(maxScore-score<=10){
                level="A";
            }

            else  if(maxScore-score<=30){
                level="C";
            }
            else if(maxScore-score<=20){
                level="B";
            }
            else{
                level="D";
            }
            System.out.println("学生"+(i+1)+"的成绩:"+score+"成绩等级"+level);

        }
    }
}
