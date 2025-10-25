package org.example.Mix;

import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String args[]){
        String str1="Tarun";
        StringBuilder sb=new StringBuilder();

        Stack<Character> st=new Stack<>();

        for(char ch:str1.toCharArray()) {
            st.push(ch);
        }
        while(!st.isEmpty()) {
            Character character = st.pop();
            sb.append(character);
        }
        System.out.println(sb);

    }
}
