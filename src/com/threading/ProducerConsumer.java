package com.threading;

import java.util.*;
import java.util.Queue;

public class ProducerConsumer  implements Runnable{
	public Queue<Integer> data = new PriorityQueue<>();
	public volatile int count = 0;
	public static void main(String s[]) throws InterruptedException{
		Thread producerThread = new Thread(new Producer());
		Thread consumerThread = new Thread(new Consumer());
		
		producerThread.start();
		Thread.sleep(2000);
		consumerThread.start();
	}

	@Override
	public void run() {

	}

	public void producer(){
		while(count!=200){
			data.add(2*count);
			count++;
		}

	}
	public void consumer(){
		while(count!=0){

		}
	}
}
