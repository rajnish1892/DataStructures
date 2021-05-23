package com.threading;

public class Array01{
    int arr[] = {0,1,1,1,1,0,0,1,0,1,0,0,1,0,1,1,1,1,0,0,0,1,1,0,0,1,0,1,0};
    volatile int  startPointer = 0;
    volatile int endPointer = arr.length-1;

    /*@Override
    public void run() {
        while(startPointer < endPointer){
            try {
                moveRight();
                moveLeft();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }*/

    public synchronized void moveRight(){

       while(startPointer < endPointer){
           while (arr[startPointer]==1)
               startPointer++;
           while(arr[startPointer]==0){
               try {
                   wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           arr[startPointer] =1;
           arr[endPointer]=0;
           notify();
       }
    }
    public synchronized void moveLeft(){
        while(startPointer < endPointer){
            while (arr[endPointer]==0)
                endPointer--;
            while(arr[endPointer]==1){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            notify();
        }
    }
    public static void main(String a[]){
        Array01 arr =new Array01();
        Thread right = new Thread(()->arr.moveRight());
        Thread left = new Thread(()->arr.moveLeft());
        right.start();
        left.start();
        try {
            right.join();
            left.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i=0;i<arr.arr.length;i++) {
            System.out.print(arr.arr[i] +" ");
        }

    }
}
