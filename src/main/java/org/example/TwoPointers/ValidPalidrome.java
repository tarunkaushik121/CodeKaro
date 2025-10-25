package org.example.TwoPointers;

import java.util.Locale;

public class ValidPalidrome {
    public static void main(String args[]){
        String str="A man, a plan, anal panama";
        boolean isPalidrome= validPalidrome(str);
        System.out.println(isPalidrome);

    }

    private static boolean validPalidrome(String str) {
        str=str.toLowerCase();
        str=str.replaceAll("[^a-z0-9]","");
        int len=str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
