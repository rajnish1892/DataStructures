package com.datastructure.problemsolving;

public class EvenOdd {
    public static void main(String a[])
    {
        // n&1 is 1, then odd, else even
       System.out.println(isEven(8));
    }

    static boolean isEven(int n)
    {
        // n&1 is 1, then odd, else even
        return ((n & 1)!=1);
    }
}
