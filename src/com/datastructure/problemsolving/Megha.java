package com.datastructure.problemsolving;

import java.util.Scanner;

public class Megha {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in) ;
        int n,x,y,t;
        int arr[];
        int sum =0;
        //n = s.nextInt();
        t = s.nextInt();
        arr = new int[t];
        for(int i=0;i<t;i++){
            arr[i] = s.nextInt();
        }
        for(int j = 0;j<t;j++){
            sum =0;
            for(int i=1;i<=arr[j];i++){
                x = i;
                y = arr[j]/x;
                sum += x*y;
            }
            System.out.println(sum);
        }
    }

    public void maxTick(){

        Scanner s = new Scanner(System.in) ;
        int n, maxTicket=0;
        n = s.nextInt();
        maxTicket += (n/500)*1000;
        n= n%500;
        maxTicket += (n/5)*5;
        System.out.println(maxTicket);
    }
    public void nearlySorted(){
            Scanner s = new Scanner(System.in) ;
            int n,k,temp;
            int arr[];
            n = s.nextInt();
            k = s.nextInt();
            arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]= s.nextInt();
            }
            for (int i=0;i<n;i++){
                if(i+k<n) {
                    for(int j=i+1;j<i+k+1 && i+k<n;j++){
                        if(arr[i]>arr[j]){
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }else{
                    for(int j=i+1;j<n;j++){
                        if(arr[i]>arr[j]){
                            temp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = temp;
                        }
                    }
                }
            }
            for (int i=0;i<n;i++){
                System.out.println(arr[i]);
            }
        }

}
