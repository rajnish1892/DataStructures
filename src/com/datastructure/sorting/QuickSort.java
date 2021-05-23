package com.datastructure.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	public List<Integer> sortNumber(List<Integer> list){
		quick(0,list.size()-1,list);

		return list;
	}
	private void quick(int min, int max, List<Integer> list){
		if(min<max){
			int pivotLocation = partion(list,min,max);
			quick(min, pivotLocation-1,list);
			quick(pivotLocation+1,max,list);
		}


	}

	private int partion(List<Integer> list, int min, int max) {
		int pivot = list.get((min+max)/2);
		int temp;
		int pivLocation =(min+max)/2;
		for(int i=min;i<max;i++){
			if(pivot>list.get(i)){
				pivLocation = i;
			}
		}
		temp = list.get(pivLocation);
		list.set(pivLocation,pivot);
		list.set((min+max)/2,temp);
		System.out.println(pivLocation);
		return pivLocation;

	}

	public static void main(String a[]) {
		//InsertionSort insertionSort = new InsertionSort();
		QuickSort quick = new QuickSort();
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(7);
		integerList.add(3);
		integerList.add(5);
		integerList.add(9);
		integerList.add(0);
		integerList.add(4);
		System.out.println("Started");
		System.out.println(quick.sortNumber(integerList));
	}

}
