package org.example.takeyouforward;

public class FindLowerBound {
    public static  void main(String args[]){
        int arr[]={1,2,2,3};
        int LB=2;
        int result=lowerBound(arr,LB);
        System.out.println(result);
        
        
    }
    
    public static int lowerBound(int arr[],int LB){
        int low=0;
        int high=arr.length-1;
        int ans = 0;
        while(low<=high){
            int mid=(low+high)/2;
            System.out.println("mid ele:"+arr[mid]);
            if(arr[mid]>=LB){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
