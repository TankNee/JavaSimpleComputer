public class SparseArrayDemo{
    public static void main(String args[]){
        /** 
         *  1. 创建原始二维数组
         *  2. 记录二维数组中的值
         *  3. 转换成稀疏数组
         *  效果：压缩数组大小，降低空间要求
        */
        int[][] initArray = new int[11][11];
        initArray[1][1] = 1;
        initArray[2][4] = 2;
        for(int row[] : initArray){ //注意这种方式的for循环
            for(int col : row){
                System.out.printf("%d\t",col);
            }
            System.out.println();
        }
        int sum = 0; //记录原始二维数组中的值的个数
        for(int row[] : initArray){
            for(int col : row){
                if(col != 0){
                    sum++;
                }
            }           
        }
        System.out.println("sum is "+ sum);
        int[][] sparsearray = new int[sum + 1][3];
        sparsearray[0][0] = 11;
        sparsearray[0][1] = 11;
        sparsearray[0][2] = sum;
        int count = 1;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if(initArray[i][j] != 0){
                    sparsearray[count][0] = i;
                    sparsearray[count][1] = j;
                    sparsearray[count][2] = initArray[i][j];
                    count++;
                }
            }
        }
        for (int row[] : sparsearray) {
            for (int col : row) {
                System.out.printf("%d\t",col);
            }
            System.out.println();
        }
    }
}