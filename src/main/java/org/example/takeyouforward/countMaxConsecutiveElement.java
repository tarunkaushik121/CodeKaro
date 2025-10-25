package org.example.takeyouforward;

public class countMaxConsecutiveElement {
    public static void main(String[] args) {
        int[] arr = {1, 1,1,1, 2, 2, 3, 4, 5, 5, 6};
        System.out.println(countMaxConsecutive(arr));
    }

    static int countMaxConsecutive(int arr[]){
        int count=0;
        int maxCount=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;
            }
            maxCount=Math.max(maxCount,count);
        }
        return maxCount;
    }
}
