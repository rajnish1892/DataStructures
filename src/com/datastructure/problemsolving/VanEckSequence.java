package com.datastructure.problemsolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class VanEckSequence {
    public static void main(String a[]){
        seq();
    }

    public static void vanSequence(){
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> seqDistMAp = new HashMap<>();
        int index =1;
        int val=0;
        int preVal =0;
        list.add(0);
       // seqDistMAp.put(0,1);
        for(int i=0;i<100;i++){
            if(seqDistMAp.get(val)==null){
                list.add(0);
                seqDistMAp.put(val,index);
                preVal = val;
                val = 0;
            }else{
                list.add(index-seqDistMAp.get(val));
                val = index-seqDistMAp.get(val);
                seqDistMAp.put(preVal,index-1);
            }
            index++;
        }

        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
    public void sequence(List<Integer> list, Map<Integer,Integer> seqMap){
        int val = 0;
        for(int i=0;i<100;i++){
            if(seqMap.get(val)==null){
                seqMap.put(0,list.size());
                list.add(0);
                val =0;
            }else{
                int data = list.size()-seqMap.get(val);
                seqMap.put(val,list.size());
                list.add(data);
                val =data;
            }
        }




    }

    public static void seq(){
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        list.add(0);
        for(int i=0;i<100;i++){
            if(map.get(list.get(list.size()-1))==null){
                map.put(list.get(list.size()-1),list.size());
                list.add(0);
            }else{
                int data = list.size()-map.get(list.get(list.size()-1));
                map.put(list.get(list.size()-1),list.size());
                list.add(data);
            }
        }
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }

}
