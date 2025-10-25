package org.example.takeyouforward;

import java.util.Stack;

public class BalanceParanthesis {
    
    public static void main(String args[]){

        String str="[{()}]";
        boolean result = isBalanced(str);

        if (result) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }

    }
    public static boolean isBalanced(String str){
        Stack<Character> stack=new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (ch == ']' || ch == '}' || ch == ')') {
                if (stack.isEmpty()) return false;

                char chtop = stack.pop();

                if ((ch == ')' && chtop != '(') ||
                        (ch == '}' && chtop != '{') ||
                        (ch == ']' && chtop != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
