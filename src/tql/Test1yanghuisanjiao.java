package tql;

public class Test1yanghuisanjiao {

    public static void main(String[] args) {
        int yanghui[][]=new int [10][];
        //确定数组的列数，即每行元素的个数
        for(int i=0;i<yanghui.length;i++){
            yanghui[i]=new int[i+1];

        }
        //确定每行的元素
        for(int i=0;i<yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                yanghui[i][0]=yanghui[i][i]=1;

                if(i>1&&j>0&&j<i) {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
            }
        }
        //遍历数组
        for(int i=0;i<yanghui.length;i++){
            for(int j=0;j<yanghui[i].length;j++){
                System.out.print(yanghui[i][j]+"\t");
            }
            System.out.println();
        }




    }

}


