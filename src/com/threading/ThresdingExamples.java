package com.threading;

public class ThresdingExamples {
    public static void main(String a[]){
        ThreadUtils tu = new ThreadUtils();
        Thread t1 = new Thread(new OddThread(tu));
        Thread t2 = new Thread(new EvenThread(tu));
        t1.start();
        t2.start();
    }

    public void lambdaThreadExample(){
        {
            Thread t1 = new Thread(()->{
                for(int i=0;i<20;i++){
                    System.out.println("First");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            });
            Thread t2 = new Thread(()->{
                for(int i=0;i<20;i++){
                    System.out.println("Second");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            });
            t1.start();
            t2.start();
        }
    }
}
