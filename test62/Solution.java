package test62;

import org.junit.Test;

public class Solution {
    @Test
    public void test() {
        System.out.println(uniquePaths(3,2));
    }
    public int uniquePaths(int m,int n) {
//        long result =1;
//        for (int i=m+n-2; i>m-1; i--)
//            result*=i;
//        for (int i=n-1; i>0; i--)
//            result/=i;
//        return (int)result;
        //官方正解   动态规划
        int [][]nums=new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if(i==0) nums[0][j]=1;
                else if(j==0) nums[i][0]=1;
                else nums[i][j]=nums[i-1][j]+nums[i][j-1];//上一个格种类+左一个格种类
            }
        }
        return nums[m-1][n-1];
    }
}
