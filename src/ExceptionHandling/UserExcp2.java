package ExceptionHandling;

import java.util.Scanner;

class NameException extends Exception{
  NameException(){
    super("User not allowed");
  }
}

class UserExcp2 {
  public static void main(String args[]){
  Scanner cin= new Scanner(System.in);
    System.out.println("Enter your name: ");
    String ex1= new String("HIMANSHU");
    String ex2= new String("KRISHNA");
    try{
      String name= cin.next();
      name= name.toUpperCase();
      
      if(name.equals(ex1) || name.equals(ex2)){
        throw new NameException();
      }
      else{
        System.out.println("Access granted to "+name);
      }
    }
    catch(NameException e){
      System.out.println(e);
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}