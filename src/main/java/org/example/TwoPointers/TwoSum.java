package org.example.TwoPointers;

import java.util.Arrays;

public class TwoSum {

    public static void main(String args[]) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twosum(arr,target)));
    }

    private static int[] twosum(int[] arr, int target) {
        int l=0;
        int r=arr.length-1;
        int result[]=new int [2];
        while(l<r){
            int sum=arr[l]+arr[r];
            if(target==sum){
                result[0]=l+1;
                result[1]=r+1;
                return result;
            } else if (sum<target) {
                l++;
            }else r--;
        }
      return new int []{1,-1};
    }



}
