package org.example.takeyouforward;

public class checkArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {11, 2, 4, 15, 6, 7, 9};
        System.out.println(isSorted(arr));
    }
    static boolean isSorted(int arr[]){
        for(int i=1;i< arr.length;i++){
            if(arr[i]<arr[i-1]);
            return false;
        }
        return true;
    }
}
