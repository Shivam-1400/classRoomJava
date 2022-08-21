package classProblem;

import java.util.Scanner;

class College{
  float clgFee;
  void inputCf(){
    System.out.print("Enter college fee: ");
    clgFee= new Scanner(System.in).nextFloat();
  }
  float getCf(){
    inputCf();
    return clgFee;
  }
} 
class Traning extends College{
  float trnFee;
  void inputTf(){
    System.out.print("Enter traning fee: ");
    trnFee= new Scanner(System.in).nextFloat();
  }
  float getTf(){
  	inputTf();
    return trnFee;
  }
}
class Student extends Traning{
  float ttl;
  void doTotal(){
    ttl= getCf() + getTf();
  }
  void show(){
    System.out.println("Total Fee= "+ ttl);
  }
}

public class worksheet3c{
  public static void main(String a[]){
    System.out.println("Example of Multilevel inheritance\n");
    
    Student aman= new Student();
    aman. doTotal();
    aman.show();
  }
}