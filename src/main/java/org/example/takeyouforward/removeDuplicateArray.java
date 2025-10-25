package org.example.takeyouforward;

import java.util.HashSet;

public class removeDuplicateArray {
    public static void main(String[] args){
        int[] arr ={1,1,2,2,3,4,5,5,6};
        System.out.println(removeDuplicatesUsingCompare(arr));
        System.out.println(removeDuplicateUsingHashet(arr));

    }
    static int removeDuplicatesUsingCompare(int arr[]){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    static int removeDuplicateUsingHashet(int arr[]){
        HashSet<Integer>hashSet=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            hashSet.add(arr[i]);
        }
        int k=hashSet.size();
        int j=0;
        for(int x:hashSet){
            arr[j++]=x;
        }
        return k;
    }
}
