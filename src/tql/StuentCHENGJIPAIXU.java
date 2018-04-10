package tql;



import java.util.List;
import java.util.Scanner;
import java.util.Vector;

 class StuentCHENGJIPAIXU {
     private String[] grade;

     public static void main(String args[]) {
         int x;


         //创建scanner对象，获取学生人数
         Scanner scanner = new Scanner(System.in);

         System.out.println("请输入学生人数：");
         x=scanner.nextInt();
         //输入x个学生和他们的成绩
         int[] score = new int[x];
         String[] grade = new String[x];
         System.out.println("请输入"+x+"个学生的成绩");

         for (int i = 0; i < x; i++) {
             score[i] = scanner.nextInt();
         }
         //输出x个学生成绩的最大值
        int max=0;
         for(int i=0;i<x;i++){
             if(score[i]>max){
                 max=score[i];
             }
         }
         //判断学生的成绩等级
         for (int j = 0; j < x; j++){
             if (score[j] > max - 10) {
                 grade[j] = "A";
             }
         else if (score[j] > max - 20) {
             grade[j] = "B";
         }
         else if (score[j] >=max - 30) {
             grade[j] = "C";
         } else {
             grade[j] = "D";
         }
     }
System.out.println("最高分是"+max);
             for(int k=0;k<x;k++){
                 System.out.println("student"+k+"score is"+score[k]+"grade is"+grade[k]);



             }

     }
     }

