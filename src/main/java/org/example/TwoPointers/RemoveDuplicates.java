package org.example.TwoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String args[]) {
        int arr[] = {1,1,2,3,3,4,5, 7, 11, 15,15};
        int k=removeduplicate(arr);
        System.out.println("Unique count: "+k);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, k)));

    }

    private static int removeduplicate(int[] arr) {

        int j=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[j-1]){
               arr[j]=arr[i];
               j++;
            }
        }

        return j;
    }
}
