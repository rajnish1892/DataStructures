package com.datastructure.dynamic;

/*
*
* Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.


**/
public class LongestCommonSubSequence {


    public static int longestCommonSubsequence(String text1, String text2) {
        int[][] memory = new int[text1.length()][text2.length()];
        return LCS(text1,text2,0,0,memory);

    }

    public static int LCS(String t1, String t2, int indexT1, int indexT2,int[][] memory){
        if(indexT1==t1.length() || indexT2==t2.length()){
            return 0;
        }else if(t1.charAt(indexT1)==t2.charAt(indexT2)){
            if(memory[indexT1][indexT2]>0)
                return memory[indexT1][indexT2];
            else {
                memory[indexT1][indexT2]=1+LCS(t1,t2,indexT1+1,indexT2+1,memory);
                return    memory[indexT1][indexT2];
            }
        }else{
            if(memory[indexT1][indexT2]>0){
                return  memory[indexT1][indexT2];
            }else{
                memory[indexT1][indexT2] =  Math.max(LCS(t1,t2,indexT1+1,indexT2,memory),LCS(t1,t2,indexT1,indexT2+1,memory));
                return  memory[indexT1][indexT2];
            }

        }
    }

    public static void main(String a[]){
        System.out.print(longestCommonSubsequence("abcde","ace"));
    }


}
