package com.tricky;

public class StringReferenceTricky {
    public StringReferenceTricky(String s){

    }
    public static void main(String a[]){
        String s1 = "test";
        String s2 = "test";
        String s3 = new String("test");
        if(s1==s2){
            System.out.println("s1 == s2");
        }
        if(s1==s3){
            System.out.println("s1 == s3");
        }

        if(s1.equals(s3)){
            System.out.println("s1 equals s3");
        }


    }
}
