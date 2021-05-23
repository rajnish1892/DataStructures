package com.datastructure.problemsolving;

import java.util.Scanner;
import java.util.Stack;

public class RemoveIdenticalCharPair {

    static String removeDuplicates(String S)
    {
        String ans = "";

        for (int i = 0; i < S.length(); i++)
        {
            if (ans.isEmpty() ||  ans.charAt(ans.length() - 1) != S.charAt(i))
                ans += S.charAt(i);
            else if (ans.charAt(ans.length() - 1) == S.charAt(i))
                ans = ans.substring(0, ans.length() - 1);
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();

        System.out.println(removeUsingStack(str));
    }
    static String removePair(String s){
        StringBuilder req= new StringBuilder(s);
        String ans = "";
        for (int i = 0; i < req.length()-1;) {
            if (req.charAt(i) == req.charAt(i + 1)) {
                req.deleteCharAt(i);
                req.deleteCharAt(i);
                i--;
            } else
                i++;
            if (i == -1)
                i++;
        }
        return req.toString();
    }
    static String removeUsingStack(String s){
        String ans="";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.empty())
                stack.push(s.charAt(i));
            else if(stack.peek()==s.charAt(i)){
                stack.pop();
            } else
                stack.push(s.charAt(i));
        }
        if(!stack.empty()){

            for(int i=0;i<stack.size();i++){
                ans+=stack.get(i);
            }
        }
        return ans;
    }
}
