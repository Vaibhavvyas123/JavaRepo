package Day2;

import java.util.Arrays;

public class SumOf2DArrays {
    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},{1,2,3},{1,2,3}
        };
        int[][] arr2= {
                {1,2,3},{1,2,3},{1,2,3}
        };
        int[][] res= new int[arr.length][arr2.length];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length;j++){
                res[i][j]=arr[i][j]+arr2[i][j];
            }
            System.out.println(Arrays.toString(res[i]));
        }

    }
}