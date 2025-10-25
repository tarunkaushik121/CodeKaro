package org.example.takeyouforward;

import java.util.Arrays;

public class moveZeroToEnd {
    public static void main(String[] args){
        int[] arr = {11, 2, 0, 15, 0, 7, 9};

        System.out.println(Arrays.toString(moveZero(arr)));

    }
    static int [] moveZero(int arr[]){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return arr;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }
}
