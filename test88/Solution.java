package test88;

import org.junit.Test;

import java.util.Arrays;

public class Solution {
    @Test
    public void merge() {
        int[] nums1={1,2,3,0,0,0};
        int m =3;
        int[] nums2={2,5,6};
        int n =3;
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
