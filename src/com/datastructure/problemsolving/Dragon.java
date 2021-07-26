package com.datastructure.problemsolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dragon {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        List<Integer> dragonStrengths = new ArrayList<>();
        List<Integer> diff = new ArrayList<>();
        for(int i=0;i<n;i++)
            dragonStrengths.add(sc.nextInt());

        for(int i=0;i<n;i=i+2)
            diff.add(Math.abs(dragonStrengths.get(i)-dragonStrengths.get(i+1)));
        for(int i=0;i<(n/2-1);i++){
            for(int j=i+1;j<n/2;j++){
                if(Math.abs(diff.get(i)-diff.get(j))<min){
                    min = Math.abs(diff.get(i)-diff.get(j));
                }
            }
        }
        System.out.println(min);
    }

   /* public static void main (String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        Arrays.sort(a);
        long max=a[0]+a[n-1];
        long min=a[0]+a[n-1];
        for(int i=0;i<n/2;i++){
            long temp=a[i]+a[n-1-i];
            max=Math.max(max,temp);
            min=Math.min(min,temp);
        }

        System.out.println(max-min);
    }*/
}
