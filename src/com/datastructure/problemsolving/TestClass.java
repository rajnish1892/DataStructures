package com.datastructure.problemsolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static Set<String> fantabulousSet = new HashSet<String>();
    public static void main(String args[] ) throws Exception {
       
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();
        //int fantabulousCount =  0;
        int subArrayCount = 2;
        int arrayLength = Integer.parseInt(br.readLine());
        String[] numberArray = br.readLine().split(" ");
        for(int i = 0; i < arrayLength; i++){
            list.add( Integer.parseInt(numberArray[i]) );
        }
        while(subArrayCount<=arrayLength){
            for(int i = 0; arrayLength>= (i + subArrayCount) ; i++){
            isFantabulous(list.subList(i,(i + subArrayCount)));
            }
            subArrayCount++;
        }
        System.out.println(fantabulousSet.size());
        
    }
    
    public static void isFantabulous(List<Integer> list){
        int highest = list.get(0);
        int secondHighest = list.get(0);
        int highestIndex = 0;
        int seconHigestIndex = 0;
       // System.out.println("List==>>"+list);
        for(int i = 1; i<list.size();i++){
            if(list.get(i)>highest){
                secondHighest = highest;
                seconHigestIndex = highestIndex;
                highest = list.get(i);
                highestIndex = i;
            } else if(list.get(i) > secondHighest){
                secondHighest = list.get(i);
                seconHigestIndex = i;
            }
        }
       // System.out.println("Coordinates=>("+seconHigestIndex+","+highestIndex+")");
        if(highestIndex > seconHigestIndex){
            //System.out.println("True");
            fantabulousSet.add(String.valueOf(highestIndex)+String.valueOf(seconHigestIndex));
        }
    }
}
