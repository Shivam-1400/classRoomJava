package Getter_Setter;

import java.util.Scanner;

class Product {
  float getBill(int qty, float price){
    float bill= qty*price;
    return bill;
  }
  
  public static void main(String ar[]){
    Product lapref;
    lapref= new Product();
    
    Scanner cin= new Scanner(System.in);
    System.out.print("Enter QTY and PRICE: ");
    int qt= cin.nextInt();
    float pr= cin.nextFloat();
    
    cin.close();
    
    float bill= lapref.getBill(qt, pr);
    System.out.println("BILL= "+bill);
  }
}