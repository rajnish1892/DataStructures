package com.datastructure.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajnish.p.kumar
 *
 *
 *Advabtages:
		Easy to understand.
		Easy to implement.
		In-place, no external memory is needed.
		Performs greatly when the array is almost sorted.
*Disadvantages

		Very expensive, O(n2)in worst case and average case.
		It does more element assignments than its counterpart, insertion sort.
 */
public class BubbleSort {
	public List<Integer> sortNumber( List<Integer> lst ){
		Integer temp;

		for(int i = 0; i < lst.size(); i++){
			boolean swap = false;
			for(int j = 0; j< lst.size()-1; j++){
				if( lst.get(j)>lst.get(j+1)){
					swap = true;
					temp = lst.get(j);
					lst.set(j, lst.get(j+1));
					lst.set(j+1, temp);
				}
				
			}
			if(swap == false){
				break;
			}
			System.out.println(lst+" "+swap);
		}
		return lst;
	}
	public void sortString(){

	}
	public static void main(String a[]){
		BubbleSort bubbleSort = new BubbleSort();
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(7);
		integerList.add(3);
		integerList.add(5);
		integerList.add(9);
		integerList.add(0);
		integerList.add(4);
		System.out.println("Started");
		bubbleSort.sortNumber(integerList);
	}
}
