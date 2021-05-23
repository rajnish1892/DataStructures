package com.datastructure.problemsolving;

import com.datastructure.sorting.QuickSort;

import java.util.List;

public class FibonaciSeries extends QuickSort {
    public static void main(String a[]){
        for (int i=0;i<15;i++)
            System.out.print(series(i)+ " ");
    }

    private static int series(int n) {
        if(n<=1)
            return n;
        return  series(n-1) + series(n-2);

    }

}
