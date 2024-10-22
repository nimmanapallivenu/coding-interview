package com.venu.program.stack;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("[]{}()"));
    }


    public static boolean isValid(String s) {
        if (s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
                continue;
            }
            size = stack.size();
            if (size == 0) return false;
            char popVal = stack.pop();
            if (c == ')' && popVal == '(') {
                continue;
            } else if (c == '}' && popVal == '{') {
                continue;
            } else if (c == ']' && popVal == '[') {
                continue;
            } else {
                return false;
            }

        }

        return stack.isEmpty();
    }

}
