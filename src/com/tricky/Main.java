package com.tricky;

import java.util.*;
public class Main
{
    static int mutate(int []a,int n, int k)
    {
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        int rem = k;
        int rem2 = n;
        int one_part = k / n;

        for(int i = 0; i < n; ++i)
        {
            mx = Math.max(mx, a[i]);
            sum += a[i];

            if(a[i] < one_part)
            {
                rem2--;
                rem -= a[i];
            }
        }

        if(sum <= k) return mx;

        int val1 = rem / rem2;

        int min_val = val1 - 1;
        int min_diff = Math.abs(rem - (min_val * rem2));

        int diff1 = Math.abs(rem - (val1 * rem2));
        if(diff1 < min_diff)
        {
            min_val = val1;
            min_diff = diff1;
        }

        int val2 = val1 + 1;
        int diff2 = Math.abs(rem - (val2 * rem2));
        return (diff2 < min_diff) ? val2 : min_val;
    }
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        for(int test=sc.nextInt();test>0;--test)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int []a=new int[n];

            for(int i=0;i<n;++i) a[i]=sc.nextInt();

            System.out.println(mutation(n,k,a));
        }
    }
    public static int mutation(int n, int k , int arr[]){
        int v_start = k/n;
        int sum =0;
        HashMap<Integer,Integer> resultMap = new HashMap<>();
        for(int i=0;i<n;i++){
        }
        return 0;

    }

}

