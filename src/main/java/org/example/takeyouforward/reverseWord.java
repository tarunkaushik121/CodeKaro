package org.example.takeyouforward;

import java.util.Arrays;
import java.util.stream.Collectors;

public class reverseWord {
    public static void main(String args[]){
        String str="Tarun Sharma";
        String words[]=str.trim().split("\\s+");
        StringBuilder rev=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            rev.append(words[i]).append(" ");
        }
        System.out.println(rev.toString().trim());
    }
}
