package com.datastructure.problemsolving;

/**
 *
 * This solution is based on  Euclid's algorithm for finding GCD(Greatest common Divisor)
 * this class also have the best method to find GCD of two numbers
 */
public class COPrime {
    public static int gcd(int a, int b){
         if(a==0||b==0)
             return 0;
         if(a==b)
             return a;
         if(a>b)
             return gcd(a-b,b);
         return gcd(b,b-a);
    }

    public static void main(String a[]){
        if(gcd(21,84)==1)
            System.out.println("Co-Prime");
        else
            System.out.println("Non-Prime");
    }
}

