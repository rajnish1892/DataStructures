package com.threading;

public class OddThread implements Runnable{
    ThreadUtils tu = new ThreadUtils();
    public OddThread(ThreadUtils tu) {
        this.tu = tu;
    }

    @Override
    public void run() {
            tu.odd();

    }
    public synchronized void odd() throws InterruptedException {
        int odd = 1;
        while(true){

            System.out.println(odd);
            odd = odd + 2;
            wait();
            notifyAll();
        }
    }
}
