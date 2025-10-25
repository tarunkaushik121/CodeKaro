package org.example.takeyouforward;

public class FloorSeilInSortedArray {
    public static void main(String args[]){
        int arr[]={3,4,4,7,8,10};
        int target=5;
        int floor=findfloor(arr,target);
        int ciel=findceil(arr,target);
        System.out.println("Floor:"+floor);
        System.out.println("Ciel:"+ciel);
    }

    public static int findfloor(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int floor=0;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] < target) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }

    public static int findceil(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ceil=0;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;
    }
}





