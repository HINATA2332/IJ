package kroos;

public class ArrayPrintDemo {

        //求数组最大值，最小值，遍历，求和，排序，反转

    /**
     *
      * @param arr 获取最大值
     * @return
     */
    public  static  int  getMax(int[][] arr) {
            int max = arr[0][0];
            for (int i = 0; i < arr.length; i++) {
                for(int j=0;j<arr[i].length;j++) {
                    if (max < arr[i][j]) {
                        max = arr[i][j];
                    }
                }
            }
            return max
                    ;
        }

        /**
         * ?
         *
         * @param arr//直接选择排序
         */
        public void selectSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length - j - 1; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
            }

        }

        /**
         * 改进后的直接选择排序
         *
         * @param arr
         * @return
         */
        public void selectSort2(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int t = i;
                for (int j = i; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        t = j;
                    }
                }
                if (t != i) {
                    int temp = arr[t];
                    arr[t] = arr[i];
                    arr[i] = temp;
                }

            }

        }

    /**
     * 冒泡排序
     */

    public void bubbleSort(int[] arr,String desc) {
        //从小到大
        if (desc=="asc") {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] >arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
            }

        }
        //从大到校
        else if (desc=="desc") {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }

                }
            }

        }
        else {
            System.out.println("您输入的有误");


        }
    }
    public int getoneSumArray(int[]  arr) {
        int sum=0;
        System.out.println("遍历一维数组");
        for (int i = 0; i < arr.length; i++) {

                System.out.print(arr[i] + " ");
                sum += arr[i];

            System.out.println();
        }
        System.out.println("所有元素总和为：" + sum);
        return 0;
    }

        public int gewtwoSumArray(int[][]  arr) {
            int sum=0;
            System.out.println("遍历二维数组");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                    sum += arr[i][j];
                }
                System.out.println();
            }
            System.out.println("所有元素总和为：" + sum);
            return 0;
        }
    /**
     * 数组中元素查找
     */
    public     boolean find(int targetnumber,int[][] array){
        for(int i=0;i<array.length;i++){
            boolean  Find =false;
            for(int j =0;j<array[i].length;j++)
            {
                if(array[i][j]==targetnumber){
                    Find=true;

                }

            }

            System.out.println(Find);
            break;
        }

        return true;
    }

    /**
     *
     * @param arr 一维数组的反转
     */
    public void fanzhuanArray(int[] arr){
    for (int x=0,y=arr.length-1;x<y;x++,y--)
    {

        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;

    }
    for(int j=0;j<arr.length;j++){
        if (j!=arr.length) {
            System.out.print(arr[j] + ",");
        }
        else {
            System.out.println();
        }
    }
}
}
