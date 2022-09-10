import java.util.*;
class Car{
    static class Cars{
        String brand; 
        String name;
        float price;
        Cars(String b, String n , float p){
        brand =b;
        name = n;
        price = p;
        }
    }
    public static void main(String args[]){
        
        Cars c1= new Cars("BMW", "x7", 333333333);
        System.out.println(c1.brand+" "+c1.name+" "+c1.price);
    }
}