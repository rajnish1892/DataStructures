package com.threading;

public class ThreadUtils {
    int num =0;
    public  synchronized void odd() {
        while(num<901){
            while(num%2==0){
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(num);
            num = num +1;
            notifyAll();
        }

    }
    public  void even() {
        synchronized(this){

            while(num<900){

                while(num%2==1){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(num);
                num = num +1;

                notify();
            }

        }

    }
}
