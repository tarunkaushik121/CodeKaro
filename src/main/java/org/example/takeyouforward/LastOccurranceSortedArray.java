package org.example.takeyouforward;

public class LastOccurranceSortedArray {
    public static void main(String args[]){
        int arr[]={1,2,2,3,5};
        int UB=3;
        int result=upperBound(arr,UB);
        System.out.println(result);

    }

    public static int upperBound(int arr[],int UB){
        int low=0;
        int high=arr.length-1;
        int ans = 0;
        while(low<=high){
            int mid=low+(high-low)/2;
            System.out.println("mid ele:"+arr[mid]);
            if(arr[mid]==UB){
                ans=mid;
                low=mid+1;
            } else if (UB<arr[mid]) {
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }


}
