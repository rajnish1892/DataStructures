package com.tricky;

public class Test {
    public static void main(String a[]){
        TestStatic t = null;
        System.out.println(t.s);
        t.testing();
        Child p = new Child();
        p.m4();
    }

}
class TestStatic{
    public static String s="Test";
    public static void testing(){
        System.out.println("Testing called");
    }

}
class Parent{
    public
    Parent(){

    }
    public static void  m1(){
        System.out.println("m1 from parent");
    }
    public static void  m2(){
        System.out.println("m2 from parent");
    }
}
class Child extends Parent{
    public static void  m1(){
        System.out.println("m1 from child");
    }
    public static void  m3(){
        System.out.println("m3 from parent");
    }
    public void  m4(){
        System.out.println("m4 from parent");
    }
}
