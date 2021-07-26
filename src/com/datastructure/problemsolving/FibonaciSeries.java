package com.datastructure.problemsolving;

import com.datastructure.sorting.QuickSort;

import java.util.List;
import java.util.Scanner;

public class FibonaciSeries extends QuickSort {
    public static void main(String args[]){
            int n;
            Scanner sc = new Scanner(System.in);
            n= sc.nextInt();
            if(series(n-1)%2==0)
                System.out.println("Dead");
            else
                System.out.println("Alive");
    }

    private static int series(int n) {
        if(n<=1)
            return n;
        return  series(n-1) + series(n-2);

    }

}
