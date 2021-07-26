package com.tricky;

import java.io.IOException;

public class CustomException extends Error {
    public static void main(String a[]){
        System.out.println("error");
    }
    public CustomException(String msg){
        super(msg);
    }

}
