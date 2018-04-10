package tql;
import kroos.*;

import kroos.ArrayPrintDemo;




import java.util.Scanner;

public class erweiArrayInput {
    public static void main(String[] args) {


        //二维数组的输入,x用于数组行，y用于数组列
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数组的行数:");
        int x=scanner.nextInt();
        System.out.println("请输入数组的列数:");
        int y=scanner.nextInt();
        int[][] Array=new int[x][y];
        System.out.println("请输入数组的元素:");
        for(int i=0;i<Array.length;i++){
            for(int j=0;j<Array[i].length;j++){
                Array[i][j]=scanner.nextInt();

            }
        }

        System.out.println("请输入要查找的数");
        int findnumber=scanner.nextInt();
        ArrayPrintDemo a2 =new ArrayPrintDemo();
       a2.find(findnumber,Array);

    }


}
