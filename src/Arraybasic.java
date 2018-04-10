
import java.util.Random;
import java.util.Arrays;
public class Arraybasic {
    public static void main(String[] args) {
        int[] num=new int[10];
        Random ran = new Random();
        for(int i=0;i<10;i++)
        {
            num[i]= ran.nextInt(10);
        }
        for(int i=0;i<10;i++){
            System.out.print(num[i]+"  ");
        }
        System.out.println();
        //数组排序后输出
        Arrays.sort(num);

        for(int i=0;i<10;i++){
            System.out.print(num[i]+"  ");
        }
        String[] names;
        names= new String []{};
        String[] names2= new String []{"aa","ss"};
        //基础数组默认值为0
        int[] score =new int[4];
        score[0]=90;
        score[3]=88;
        for(int i=0;i<score.length;i++){
            System.out.println(score[i]);
        }
        //布尔类数组默认为false
        boolean[] bool =new boolean[3];
        for(int i=0;i<bool.length;i++){
            System.out.println(bool[i]);
        }
        int[][] num1=new int [3][];
        num1[0]=new int [5];
        num1[1]=new int [3];
        num1[2]=new int [5];
        num1[1][0]=99;

        //二维数组的遍历
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){
                System.out.print(num1[i][j]+"    ");
            }
            System.out.println();
        }

        //int [] x,int y[][];
        int[] x,y[];
        y=new int [3][2];
        //让x等于y的第一行数组的全部元素，这种赋值是正确的
        x=y[0];
        //让x[0]等于y的第一行元素，这种就不行，必须精确到么某一个具体元素
        //x[0]=y[0];

    }
}
