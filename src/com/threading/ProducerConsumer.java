package com.threading;

public class ProducerConsumer {

	public static void main(String s[]) throws InterruptedException{
		Thread producerThread = new Thread(new Producer());
		Thread consumerThread = new Thread(new Consumer());
		
		producerThread.start();
		Thread.sleep(2000);
		consumerThread.start();
	}
}
