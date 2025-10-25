package org.example.takeyouforward;

public class largestOddNumberString {
    public static void main(String args[]){
        String str="0214638";

        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);

            if((ch-0)%2==0){
                System.out.println(str.substring(0,i+1));
            }
        }
    }
}
