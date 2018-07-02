import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.datastructure.sorting.BubbleSort;


public class Test {

	/**
	 * @param args
	 * @throws NumberFormatException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br;
		do{
			System.out.println("Enter your choise\n 1) Sorting\n 2) Searching \n 3) Greedy Algorithms \n 4) Dynamic programming \n 5) Pattern Searching \n 6) String Algorithms \n 7) Back Tracking \n 8) Divide and Conquer \n 9) Geometric Algorithms \n 10) Mathematical Algorithms \n 11) Bit Algorithms \n 12) Graph Algorithms \n 13) Randomized Algorithms \n 14) Branch and Bound");
			br = new BufferedReader(new InputStreamReader(System.in));
			try {
				chooseAlgorithmType(Integer.valueOf(br.readLine()), br);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Do you want to continue");
		}while(br.readLine().equals("Y") || br.readLine().equals("y"));
	}
	private static void chooseAlgorithmType(int choice, BufferedReader br) throws IOException{

		switch(choice){
		case 1:
			do{
				System.out.println("Enter your choise\n 1) Bubble sort \n 2) Selection Sort \n 3) Insertion Sort \n 4) Merge Sort \n 5) Heap Sort \n 6) QuickSort \n 7) Radix Sort \n 8) Counting Sort \n 9) Bucket Sort \n 10) ShellSort \n 11) Comb Sort \n 12) Pigeonhole Sort \n 13) Cycle Sort");
				chooseSortingAlgorithms(Integer.valueOf(br.readLine()), br);
				System.out.println("Do you want to continue");
			}while(br.readLine().equals("Y") || br.readLine().equals("y"));
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
			break;
		case 11:
			break;
		case 12:
			break;
		case 13:
			break;
		case 14:
			break;
		}

	}

	private static void chooseSortingAlgorithms(int choice,  BufferedReader br) throws IOException{
		switch(choice){
		case 1:
			System.out.println("How many numbers you want to enter");
			int count = Integer.parseInt(br.readLine());
			System.out.println("Enter the elements");
			List<Integer> lst = new ArrayList<Integer>();
			for(int i = 0; i < count ; i++){
				if(br.readLine()!=null){
					lst.add(Integer.valueOf(br.readLine()));
				}
			}
			BubbleSort bubbleSort = new BubbleSort();
			lst = bubbleSort.sortNumber(lst);
			System.out.println(lst);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 9:
			break;
		case 10:
		}
	}

}
