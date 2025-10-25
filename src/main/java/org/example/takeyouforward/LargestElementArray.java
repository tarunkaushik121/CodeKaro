package org.example.takeyouforward;

public class LargestElementArray {
    public static void main(String[] agrs){
        int[] arr ={1,2,4,15,6,7,9};
        System.out.println(largestNo(arr));
    }

    static int largestNo(int arr[]){
        int max=arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
       return max;
    }

}
