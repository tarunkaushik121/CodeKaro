package org.example.takeyouforward;

public class secondLargestElement {
    public static void main(String[] args){
        int[] arr ={11,2,4,15,6,7,9};
        secondLargestEle(arr);
    }
    static void secondLargestEle(int[] arr){
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int num:arr){
            if(num>first){
                second=first;
                first=num;
            }else if(num>second && num!=first){
                second=num;
            }
        }

        System.out.println(first+"-->"+second);

    }



}
