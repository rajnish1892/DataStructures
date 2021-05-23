package com.datastructure.problemsolving;

public class ArrayWith01Sorting {
    public static void sort(int[] arr){
        int  startPointer = 0;
        int endPointer = arr.length-1;
        while(startPointer<endPointer){
            while(arr[startPointer]==1){
                startPointer++;
            }
            while(arr[endPointer]==0){
                endPointer--;
            }
            arr[startPointer]=1;
            startPointer++;
            arr[endPointer]=0;
            endPointer--;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String a[]){
        int arr[] = {0,1,1,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,0,0,0,1,1,0,0,1,0,1,0};
        sort(arr);
    }
}
