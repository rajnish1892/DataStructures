package com.threading;

public class EvenThread implements Runnable{
    ThreadUtils tu = new ThreadUtils();
    public EvenThread(ThreadUtils tu) {
        this.tu = tu;
    }

    @Override
    public void run() {

            tu.even();

    }
    private synchronized void even() throws InterruptedException {
    int even = 2;
        while(true){
            System.out.println(even);
            even = even +2;
            wait();
            notifyAll();
        }
    }
}
