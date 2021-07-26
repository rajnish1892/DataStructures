package com.datastructure.problemsolving;

import java.util.Scanner;

public class FactorOfA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(fact(a,b))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
    public static boolean fact(int a,int b){
        if(a==b)
            return true;
        for(int i=2;i<a/2;i++){
            if(a%i==0 && (a+i)<=b){
                if(fact(a+i,b))
                    return true;
            }
        }
        return false;
    }
}




