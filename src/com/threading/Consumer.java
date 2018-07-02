package com.threading;

public class Consumer implements Runnable{
	int count = 0;
	public void run(){
		consume();
	}
	
	public void consume(){
		System.out.println("Consumer");
		while(Producer.list.size()!=0){
			System.out.println("Consumed "+Producer.list.get(count++));
		}
		
	}
}
