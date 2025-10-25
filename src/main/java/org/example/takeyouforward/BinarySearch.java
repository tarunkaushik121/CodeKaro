package org.example.takeyouforward;

import java.util.Arrays;

public class BinarySearch {
    public static void main (String args[]){
        int arr[]={10,5,54,8,2,6,4};
        int target=2;
        Arrays.sort(arr);

        //Binary search should works only for sorted Array
        int result=binarySearch(arr,target);
        System.out.println(result);

    }

    public  static int binarySearch(int arr[], int target){
        int low=0;
        int high=arr.length-1;

        while(low<=high){
            int mid=low + (high - low) / 2;
            System.out.println("Mid index: " + mid + ", Mid element: " + arr[mid]);

            if(arr[mid]==target){
                return  mid;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }

        return -1;
    }
}

