package com.coding;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Given an array arr of N integers. Find the contiguous sub-array with maximum sum.
 *
 * {1,2,3,-2,5};
 *
 * {1},{2},{3} =5, {1,2},{2,3},{3,-2}=5 {1,2,3}=6
 * arr[] = {1,2,3,-2,5}
 * Output:
 * 9
 *
 * arr[] = {-1,-2,-3,-4}
 * Output:
 * -1
 * arr[] = {3,-,2-1,1}
 * output : 3
 */
public class Test {
    public static void main(String a[]){
        int arr[] = {1,2,3,-2,5};
        int max = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            int temp = maxSum(arr,0,Integer.MIN_VALUE,i);
           if(temp>max)
               max=temp;
        }
          System.out.println(max);

        List<Person> l;
      //  l.stream().collect(Collectors.groupingBy(Person::getName,Collectors.counting()));
    }
    public static int  maxSum(int[] arr, int i, int max,int n){
        int sum = 0;
        if(i+n-1==arr.length){
            return max;
        }
        for(int x=i;x<i+n && i+n<=arr.length;i++){
            sum+=arr[i];
        }
        if(sum>max)
           return  maxSum(arr,i+1,sum,n);
        else
           return  maxSum(arr,i+1,max,n);
       // return max;
    }
}



final class ImmutableClass{
    public final Map<String,String> m ;
    ImmutableClass(Map<String, String> m){
        Map<String,String> map = new HashMap<>();
        for(Map.Entry<String,String> e:m.entrySet()){
            map.put(e.getKey(),e.getValue());
        }
        this.m = map;
    }
    public Map<String, String> getMap(){
        Map<String,String> map = new HashMap<>();
        for(Map.Entry<String,String> e:m.entrySet()){
            map.put(e.getKey(),e.getValue());
        }
        return map;
    }


}

class Person{
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
