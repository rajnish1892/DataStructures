package com.tricky;


import java.util.List;
import java.util.Map;

interface  Item{
    String getItemType();
    int getPrice();
    int getModelNumber();
}
abstract class Cloth implements Item{

}
 class Jeans extends Cloth{

     @Override
     public String getItemType() {
         return null;
     }

     @Override
     public int getPrice() {
         return 0;
     }

     @Override
     public int getModelNumber() {
         return 0;
     }
 }
 class Shirt extends Cloth{

     @Override
     public String getItemType() {
         return null;
     }

     @Override
     public int getPrice() {
         return 0;
     }

     @Override
     public int getModelNumber() {
         return 0;
     }
 }
public class ShoppingCart<ItemType> {
    List<Item> items;
    Map<ItemType,Item> itemMap;


public static void main(String a[]){
    ShoppingCart s = new ShoppingCart();


}
}

class Factory{

    void itemDeligator(){

    }
}
