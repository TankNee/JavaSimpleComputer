import java.util.Arrays;

public class MaxTriangle{
    public static void main(String args[]){
        int[] A = new int[3];
        A[0] = 2;
        A[1] = 2;
        A[2] = 1;
        System.out.println(largestPerimeter(A));
    }
    public static int largestPerimeter(int[] A) {
        if(A == null || A.length <3){
            return 0;
        }
        int max = 0;
        Arrays.sort(A);
        for(int i = 2;i<A.length;i++){
            int tempSum = A[i]+A[i-1]+A[i-2];
            if(2*A[i] < tempSum){
                max = Math.max(max,tempSum);
            }
        }
        return max;
    }
}