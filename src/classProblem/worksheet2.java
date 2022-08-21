//program of different types of onstructors in java
package classProblem;

import java.util.Scanner;


class BankAc{
	int bal;
	
	//Default constructor
  BankAc(){
     System.out.print("Enter opening balance: ");
     bal= new  Scanner(System.in).nextInt();
     
     showBal();
     System.out.println("This is a default constructor");
  }
  
  //Parameterized constructor
  BankAc(int bal){
    this.bal= bal;
    showBal();
    System.out.println("This is a parameterised constructor");
  }
  
  //Copy constructor
  BankAc(BankAc obj){
    bal= obj.bal;
    showBal();
    System.out.println("This is a copy constructor");
  }
  void showBal(){
    System.out.println("\nBalance is: "+ bal);
  }
}

public class worksheet2{
  public static void main(String args[]){
    BankAc aman= new BankAc();
    BankAc raman= new BankAc(100);
    BankAc chaman= new BankAc(raman);
  }
}