package com.datastructure.problemsolving;

import java.util.HashMap;
import java.util.Map;

class Solution{

    public static void main(String a[]){
        //tupples();
    }
   /* public static void tupples(){
        Map<Long,Pair> map = new HashMap<>();
        long sum =0;
        Pair pair =null;
        for(long i=1;i<100-1;i++){
            sum = i*i*i;
            for(long j=i+1;j<100;j++){

                Pair x = new Pair(i,j);
                map.put(sum + j*j*j,x);
            }
        }
        for(long i=1;i<100;i++){
            pair = map.get(i*i*i);
            if(pair!=null && !pair.contains(i)){
                System.out.println(i+", "+ pair.a+", " +pair.b);
            }
        }
    }*/
}

class Pair{
    long a;
    long b;
    Pair(long a, long b){
        this.a = a;
        this.b = b;
    }
    boolean contains(int x){
        if(x==a||x==b)
            return true;
        return false;
    }
}
