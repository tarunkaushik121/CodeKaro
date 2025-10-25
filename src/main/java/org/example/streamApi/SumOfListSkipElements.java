package org.example.streamApi;

import java.util.List;

public class SumOfListSkipElements {

    //We have to perform sum of list elements but skip ist and last element
    public static void main(String args[]){
        List<Integer> list= List.of(1,2,3,4,5,6,7,8);
        int len=list.size();
        int sum=list.stream().skip(1).limit(len-2).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
