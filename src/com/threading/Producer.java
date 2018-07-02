package com.threading;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {
	public static List<Integer> list = new ArrayList<Integer>();
	public int count = 0;
	public void run(){
		produce();
	}
	
	public void produce(){
		while(list.size()!=22){
			list.add(count++);
			System.out.println("produced "+list.get(count-1));
		}
		
		
	}

}
