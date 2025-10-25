package org.example.takeyouforward;

import java.util.Arrays;

public class longestCommonPrefix{

    public static void main(String args[]){
        String str[]={"flower", "flows","flu"};
        String st2=longestPrefix(str);
        System.out.println(st2);
    }

    private static String longestPrefix(String[] str) {
        if(str==null || str.length==0){
            return "";
        }
        Arrays.sort(str);
        String first=str[0];
        String last=str[str.length-1];
        int i=0;

        while(i<first.length()&& i<last.length() && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}
