package com.datastructure.problemsolving;

import java.util.Map;
import java.util.TreeMap;

public class DigitFrequencyInPrimeRange {

    public int maxDigit(int L, int R)
    {
        // code here
        int max =0;
        int maxFreq =0;
        boolean noPrime=true;

        Map<Integer,Integer> m = new TreeMap<>();
        for(int i = L;i<=R;i++){
            if(isPrime(i)){
                //System.out.print(i+" ");
                noPrime = false;
                addToMap(i,m);
            }
        }
        if(noPrime)
            return -1;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            System.out.println(e.getKey()+ " "+e.getValue());
            if(e.getValue()>=max){
                max = e.getValue();
                maxFreq = e.getKey();
            }
        }

        return maxFreq;

    }
    public boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public void addToMap(int n, Map<Integer,Integer> map){
        int r=0;
        while(n%10!=0){
            r=n%10;
            n=n/10;
            if(map.get(r)==null)
                map.put(r,1);
            else
                map.put(r,map.get(r)+1);
        }

    }

    public static void main(String a[]){
        DigitFrequencyInPrimeRange d = new DigitFrequencyInPrimeRange();
        d.maxDigit(8,565);
    }
}
