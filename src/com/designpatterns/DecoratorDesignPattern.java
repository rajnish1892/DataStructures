package com.designpatterns;

public class DecoratorDesignPattern {
    public static void main(String a[]){

    }
}
class Pizza{
    public int getCost(){
        return 10;
    }
}
class CapsicumDecorator extends Pizza{
    @Override
    public int getCost() {
        return super.getCost()+20;
    }
}
class CheeseBustDecorator extends Pizza{
    @Override
    public int getCost() {
        return super.getCost()+100;
    }
}
